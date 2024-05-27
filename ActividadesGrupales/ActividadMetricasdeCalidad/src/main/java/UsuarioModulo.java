import java.util.*;

class UsuarioModulo {
    private List<Usuario> usuarios = new ArrayList<>();
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        GrupoContactoModulo.agregarUsuarioAGrupo(usuario, "General");
    }
    public void eliminarUsuario(String nombre) {
        usuarios.removeIf(u -> u.getNombre().equals(nombre));
    }

}
// Ce = 2
// Ca = 1