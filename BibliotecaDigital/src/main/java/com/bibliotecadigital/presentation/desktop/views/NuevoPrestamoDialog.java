/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.bibliotecadigital.presentation.desktop.views;

import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.presentation.desktop.controllers.GestionPrestamosController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class NuevoPrestamoDialog extends javax.swing.JDialog {

    private final GestionPrestamosController controller;
    private DefaultTableModel materialesDisponiblesModel;
    private DefaultTableModel materialesSeleccionadosModel;
    private List<MaterialBiblioteca> materialesSeleccionados = new ArrayList<>();
    
    /**
     * Creates new form NuevoPrestamoDialog
     */
    public NuevoPrestamoDialog(java.awt.Frame parent, GestionPrestamosController controller) {
        super(parent, "Nuevo Préstamo", true);
        this.controller = controller;
        initComponents();
        
        try {
            configurarModelos();
            cargarUsuarios();
            configurarEventos();
        } catch (Exception e) {
            System.err.println("Error al inicializar el diálogo: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Error al inicializar el diálogo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        
        setSize(800, 600);
        setLocationRelativeTo(parent);
    }
    

    
    /**
    * Inicializa el diálogo con datos y configuraciones
    */
    public void inicializar() {
        try {
            configurarModelos();
            cargarUsuarios();
            configurarEventos();
        } catch (Exception e) {
            System.err.println("Error al inicializar el diálogo: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                "Error al inicializar el diálogo: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Configura los modelos de las tablas
     */
    private void configurarModelos() {
        // Configurar modelo para materiales disponibles
        String[] columnNames = {"ID", "Título", "Autor", "Tipo"};
        materialesDisponiblesModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        materialesDisponiblesTable.setModel(materialesDisponiblesModel);
        
        // Configurar modelo para materiales seleccionados
        materialesSeleccionadosModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        materialesSeleccionadosTable.setModel(materialesSeleccionadosModel);
    }
    
    /**
     * Carga la lista de usuarios en el combobox
     */
    @SuppressWarnings("unchecked") // Suprimimos la advertencia de compilación
    private void cargarUsuarios() {
        // Creamos un modelo genérico
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        // Obtenemos los usuarios
        List<Usuario> usuarios = controller.obtenerUsuarios();

        // Añadimos cada usuario al modelo
        for (Usuario usuario : usuarios) {
            model.addElement(usuario);
        }

        // Asignamos el modelo al combobox
        usuarioComboBox.setModel(model);
    }
    
    /**
     * Configura los eventos de los botones
     */
    private void configurarEventos() {
        buscarButton.addActionListener(evt -> buscarMateriales());
        agregarButton.addActionListener(evt -> agregarMaterial());
        quitarButton.addActionListener(evt -> quitarMaterial());
        crearPrestamoButton.addActionListener(evt -> crearPrestamo());
        cancelarButton.addActionListener(evt -> dispose());
    }
    
    /**
     * Busca materiales según el texto ingresado
     */
    private void buscarMateriales() {
        String termino = busquedaField.getText().trim();
        if (termino.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor ingrese un término de búsqueda", 
                "Búsqueda vacía", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        List<MaterialBiblioteca> resultados = controller.buscarMaterialesPorTitulo(termino);
        
        // Limpiar tabla de disponibles
        materialesDisponiblesModel.setRowCount(0);
        
        // Llenar con resultados, excluyendo los ya seleccionados
        for (MaterialBiblioteca material : resultados) {
            if (!materialesSeleccionados.contains(material) && material.isDisponible()) {
                String autorNombre = !material.getAutores().isEmpty() ? 
                                   material.getAutores().get(0).getNombre() : "Desconocido";
                                   
                materialesDisponiblesModel.addRow(new Object[]{
                    material.getId(),
                    material.getTitulo(),
                    autorNombre,
                    material.getClass().getSimpleName()
                });
            }
        }
    }
    
    /**
     * Agrega un material a la lista de seleccionados
     */
    private void agregarMaterial() {
        int filaSeleccionada = materialesDisponiblesTable.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Por favor seleccione un material",
                "Selección vacía",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener datos del material seleccionado
        int id = (Integer) materialesDisponiblesModel.getValueAt(filaSeleccionada, 0);
        String titulo = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 1);
        String autor = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 2);
        String tipo = (String) materialesDisponiblesModel.getValueAt(filaSeleccionada, 3);
        
        // Buscar el material completo en los resultados de búsqueda
        String termino = busquedaField.getText().trim();
        List<MaterialBiblioteca> resultados = controller.buscarMaterialesPorTitulo(termino);
        
        MaterialBiblioteca materialSeleccionado = null;
        for (MaterialBiblioteca material : resultados) {
            if (material.getId() == id) {
                materialSeleccionado = material;
                break;
            }
        }
        
        if (materialSeleccionado != null) {
            // Agregar a seleccionados
            materialesSeleccionados.add(materialSeleccionado);
            materialesSeleccionadosModel.addRow(new Object[]{id, titulo, autor, tipo});
            
            // Eliminar de disponibles
            materialesDisponiblesModel.removeRow(filaSeleccionada);
        }
    }
    
    /**
     * Quita un material de la lista de seleccionados
     */
    private void quitarMaterial() {
        int filaSeleccionada = materialesSeleccionadosTable.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                "Por favor seleccione un material",
                "Selección vacía",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Obtener datos del material seleccionado
        int id = (Integer) materialesSeleccionadosModel.getValueAt(filaSeleccionada, 0);
        
        // Buscar en la lista de materiales seleccionados
        MaterialBiblioteca materialAQuitar = null;
        for (MaterialBiblioteca material : materialesSeleccionados) {
            if (material.getId() == id) {
                materialAQuitar = material;
                break;
            }
        }
        
        if (materialAQuitar != null) {
            // Quitar de seleccionados
            materialesSeleccionados.remove(materialAQuitar);
            materialesSeleccionadosModel.removeRow(filaSeleccionada);
            
            // Si está activa la búsqueda actual, volver a agregarlo a disponibles
            String termino = busquedaField.getText().trim();
            if (!termino.isEmpty() && materialAQuitar.getTitulo().toLowerCase().contains(termino.toLowerCase())) {
                String autorNombre = !materialAQuitar.getAutores().isEmpty() ? 
                                   materialAQuitar.getAutores().get(0).getNombre() : "Desconocido";
                
                materialesDisponiblesModel.addRow(new Object[]{
                    materialAQuitar.getId(),
                    materialAQuitar.getTitulo(),
                    autorNombre,
                    materialAQuitar.getClass().getSimpleName()
                });
            }
        }
    }
    
    /**
     * Crea un nuevo préstamo con los datos seleccionados
     */
    private void crearPrestamo() {
        Usuario usuarioSeleccionado = (Usuario) usuarioComboBox.getSelectedItem();
        
        if (usuarioSeleccionado == null) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar un usuario",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (materialesSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Debe seleccionar al menos un material",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Crear el préstamo a través del controlador
        controller.crearPrestamo(usuarioSeleccionado, materialesSeleccionados);
        
        // Cerrar el diálogo
        dispose();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        busquedaField = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialesDisponiblesTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        agregarButton = new javax.swing.JButton();
        quitarButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materialesSeleccionadosTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        crearPrestamoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Préstamo");
        setModal(true);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Usuario:");
        jPanel2.add(jLabel1);

        usuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuarioComboBox.setPreferredSize(new java.awt.Dimension(90, 22));
        jPanel2.add(usuarioComboBox);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jLabel2.setText("Buscar material:");
        jPanel3.add(jLabel2);

        busquedaField.setPreferredSize(new java.awt.Dimension(120, 22));
        jPanel3.add(busquedaField);

        buscarButton.setText("Buscar");
        jPanel3.add(buscarButton);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Materiales disponibles:");
        jPanel5.add(jLabel3, java.awt.BorderLayout.NORTH);

        materialesDisponiblesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(materialesDisponiblesTable);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        agregarButton.setText(">>");
        jPanel6.add(agregarButton);

        quitarButton.setText("<<");
        jPanel6.add(quitarButton);

        jPanel4.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("Materiales seleccionados:");
        jPanel7.add(jLabel4, java.awt.BorderLayout.NORTH);

        materialesSeleccionadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(materialesSeleccionadosTable);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        crearPrestamoButton.setText("Crear Préstamo");
        jPanel8.add(crearPrestamoButton);

        cancelarButton.setText("Cancelar");
        jPanel8.add(cancelarButton);

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField busquedaField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton crearPrestamoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable materialesDisponiblesTable;
    private javax.swing.JTable materialesSeleccionadosTable;
    private javax.swing.JButton quitarButton;
    private javax.swing.JComboBox<String> usuarioComboBox;
    // End of variables declaration//GEN-END:variables
}
