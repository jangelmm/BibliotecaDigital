package com.bibliotecadigital.domain.service;

import com.bibliotecadigital.domain.model.Usuario;
import java.util.Optional; // Importar Optional

public class AuthenticationService {
    
    // 1. La dependencia ahora es contra la INTERFAZ, no la clase concreta.
    private final UsuarioRepository usuarioRepo;

    // 2. El constructor ahora pide un UsuarioRepository. Esto se llama Inyección de Dependencias.
    public AuthenticationService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    /**
     * Intenta autenticar a un usuario.
     * @param email El email del usuario.
     * @param password La contraseña en texto plano.
     * @return Un Optional que contiene al Usuario si el login es exitoso, o un Optional vacío si falla.
     */
    public Optional<Usuario> login(String email, String password) {
        // 3. Usamos el nuevo repositorio y manejamos el Optional.
        Optional<Usuario> usuarioOpt = usuarioRepo.findByEmail(email);

        // 4. Lógica moderna y segura con map y filter de Optional.
        return usuarioOpt.filter(usuario -> usuario.verificarPassword(password));
    }
    
    /**
     * Verifica si un usuario tiene permiso para una funcionalidad.
     * (Este método no cambia, pero es bueno mantenerlo aquí).
     */
    public boolean tienePermiso(Usuario usuario, String funcionalidad) {
        if (usuario == null) return false;
        
        switch(usuario.getRol()) {
            case ADMINISTRADOR:
                return true; // Acceso total
            case ENCARGADO:
                return !funcionalidad.equals("configuracion_sistema");
            case CLIENTE:
                return funcionalidad.equals("buscar_materiales") || 
                       funcionalidad.equals("prestar_material") ||
                       funcionalidad.equals("devolver_material");
            default:
                return false;
        }
    }
}