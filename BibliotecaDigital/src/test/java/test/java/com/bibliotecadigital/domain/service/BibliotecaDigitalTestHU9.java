/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.AuthenticationService;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;

/**
 *
 * @author Manu-Hdz
 */
public class BibliotecaDigitalTestHU9 {
    public static void main(String[] args) {
        InMemoryBibliotecaRepository biblioteca = new InMemoryBibliotecaRepository();
        AuthenticationService auth = new AuthenticationService(biblioteca);

        // Registro de usuarios
        biblioteca.registrarUsuario("Carlos", "carlos@mail.com", "12345");
        biblioteca.registrarUsuario("Ana", "ana@mail.com", "abc123");
        
        System.out.println("Usuarios Registrado"
                + "\n Carlos, carlos@gmail.com, 12345"
                + "\n Ana, ana@gmail.com, abc123");
        
        // Intento de login
        System.out.println("\n Primer intento de login"
                + "\n Usuario carlos@gmail.com, password: 12345");
        
        Usuario user = auth.login("carlos@mail.com", "12345");
        System.out.println(user == null ? "Login fallido." : "Login correcto.");

        // Intento con contraseña incorrecta
        System.out.println("\n Segundo intento de login"
                + "\n Usuario ana@gmail.com, password: incorrecta");
        
        Usuario user2 = auth.login("ana@mail.com", "Incorrecta");
        System.out.println(user2 == null ? "Login fallido." : "Login correcto.");
    }
}
