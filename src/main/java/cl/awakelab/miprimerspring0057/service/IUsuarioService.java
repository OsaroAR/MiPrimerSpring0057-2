package cl.awakelab.miprimerspring0057.service;

import cl.awakelab.miprimerspring0057.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> listarUsuario();
    public Usuario listarUsuarioId(int idUsuario);
    public Usuario crearUsuario(Usuario usuario);
    public Usuario actualizarUsuario(int id, Usuario usuario);
    public void eliminarUsuario(int idUsuario);
    public void eliminarUsuarioId(Usuario usuarioEliminado);
}
