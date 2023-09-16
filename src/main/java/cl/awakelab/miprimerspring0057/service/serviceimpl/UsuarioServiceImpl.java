package cl.awakelab.miprimerspring0057.service.serviceimpl;
import cl.awakelab.miprimerspring0057.entity.Usuario;
import cl.awakelab.miprimerspring0057.repository.IUsuarioRepository;
import cl.awakelab.miprimerspring0057.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    IUsuarioRepository objUsuarioRepo;

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> listarUsuario = new ArrayList<>();
        listarUsuario = objUsuarioRepo.findAll();
        return listarUsuario;
    }

    @Override
    public Usuario listarUsuarioId(int idUsuario) {
        return objUsuarioRepo.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario = objUsuarioRepo.save(usuario);
        return nuevoUsuario;
    }

    @Override
    public Usuario actualizarUsuario(int id, Usuario usuario) {
        Usuario usuarioEncontrado = objUsuarioRepo.findById(id).orElse(null);
        usuarioEncontrado.setNombreUsuario(usuarioEncontrado.getNombreUsuario());
        usuarioEncontrado.setContrasena(usuarioEncontrado.getContrasena());
        usuarioEncontrado.setRol(usuarioEncontrado.getRol());
        return objUsuarioRepo.save(usuarioEncontrado);
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
        objUsuarioRepo.deleteById(idUsuario);
    }

    @Override
    public void eliminarUsuarioId(Usuario usuarioEliminado) {
        objUsuarioRepo.delete(usuarioEliminado);
    }
}
