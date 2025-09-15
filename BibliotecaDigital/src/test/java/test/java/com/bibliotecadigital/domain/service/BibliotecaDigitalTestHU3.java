/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Libro;
import com.bibliotecadigital.domain.model.Audio;
import com.bibliotecadigital.domain.model.Revista;
import com.bibliotecadigital.domain.model.Video;
import com.bibliotecadigital.domain.model.MaterialBiblioteca;
import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.infrastructure.persistence.InMemoryBibliotecaRepository;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaDigitalTestHU3 {

    @Test
    void crearPrestamoConMultiplesMateriales() {
        InMemoryBibliotecaRepository repo = new InMemoryBibliotecaRepository();
        Usuario usuario = new Usuario("Juan", "juan@email.com", "1234");
        MaterialBiblioteca mat1 = new Libro(1, "Libro A", 2020, "/libroA.pdf", "Editorial A", 200);
        MaterialBiblioteca mat2 = new Libro(2, "Libro B", 2021, "/libroB.pdf", "Editorial B", 150);

        List<MaterialBiblioteca> materiales = Arrays.asList(mat1, mat2);

        Prestamo prestamo = repo.crearPrestamo(usuario, materiales);

        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(2, prestamo.getMateriales().size());
        assertFalse(mat1.isDisponible());
        assertFalse(mat2.isDisponible());
        assertEquals(LocalDate.now(), prestamo.getFechaPrestamo());
        assertEquals(LocalDate.now().plusDays(15), prestamo.getFechaDevolucion());
    }

    @Test
    void crearPrestamoConUnSoloMaterial() {
        InMemoryBibliotecaRepository repo = new InMemoryBibliotecaRepository();
        Usuario usuario = new Usuario("Ana", "ana@email.com", "abcd");
        MaterialBiblioteca mat = new Libro(3, "Libro C", 2019, "/libroC.pdf", "Editorial C", 300);

        List<MaterialBiblioteca> materiales = Collections.singletonList(mat);

        Prestamo prestamo = repo.crearPrestamo(usuario, materiales);

        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(1, prestamo.getMateriales().size());
        assertFalse(mat.isDisponible());
        assertEquals(LocalDate.now(), prestamo.getFechaPrestamo());
        assertEquals(LocalDate.now().plusDays(15), prestamo.getFechaDevolucion());
    }

    @Test
    void crearPrestamoConMaterialNoDisponible() {
        InMemoryBibliotecaRepository repo = new InMemoryBibliotecaRepository();
        Usuario usuario = new Usuario("Luis", "luis@email.com", "pass");
        MaterialBiblioteca mat = new Libro(4, "Libro D", 2018, "/libroD.pdf", "Editorial D", 120);
        mat.setDisponible(false); // Ya no disponible

        List<MaterialBiblioteca> materiales = Collections.singletonList(mat);

        Prestamo prestamo = repo.crearPrestamo(usuario, materiales);

        // El método no valida disponibilidad, solo la cambia a false
        assertFalse(mat.isDisponible());
        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(1, prestamo.getMateriales().size());
    }

    @Test
    void idsDePrestamoSonUnicos() {
        InMemoryBibliotecaRepository repo = new InMemoryBibliotecaRepository();
        Usuario usuario = new Usuario("Sofia", "sofia@email.com", "xyz");
        MaterialBiblioteca mat1 = new Libro(5, "Libro E", 2022, "/libroE.pdf", "Editorial E", 220);
        MaterialBiblioteca mat2 = new Libro(6, "Libro F", 2023, "/libroF.pdf", "Editorial F", 180);

        Prestamo prestamo1 = repo.crearPrestamo(usuario, Collections.singletonList(mat1));
        Prestamo prestamo2 = repo.crearPrestamo(usuario, Collections.singletonList(mat2));

        assertNotEquals(prestamo1.getId(), prestamo2.getId());
    }
    
    @Test
    void crearPrestamoConTodosLosMateriales() {
        InMemoryBibliotecaRepository repo = new InMemoryBibliotecaRepository();
        Usuario usuario = new Usuario("Carlos", "carlos@email.com", "clave");

        MaterialBiblioteca libro = new Libro(1, "Libro X", 2022, "/libroX.pdf", "Editorial X", 250);
        MaterialBiblioteca audio = new Audio(2, "Audio Y", 2021, "/audioY.mp3", 180.0f, "MP3");
        MaterialBiblioteca revista = new Revista(3, "Revista Z", 2020, "/revistaZ.pdf", "Editorial Z", 45);
        MaterialBiblioteca video = new Video(4, "Video W", 2023, "/videoW.mp4", 90.0f, "MP4");

        List<MaterialBiblioteca> materiales = Arrays.asList(libro, audio, revista, video);

        Prestamo prestamo = repo.crearPrestamo(usuario, materiales);

        assertEquals(usuario, prestamo.getUsuario());
        assertEquals(4, prestamo.getMateriales().size());
        assertFalse(libro.isDisponible());
        assertFalse(audio.isDisponible());
        assertFalse(revista.isDisponible());
        assertFalse(video.isDisponible());
        assertEquals(LocalDate.now(), prestamo.getFechaPrestamo());
        assertEquals(LocalDate.now().plusDays(15), prestamo.getFechaDevolucion());
    }
    
}