package cl.awakelab.miprimerspring0057.service.serviceimpl;
import cl.awakelab.miprimerspring0057.entity.Curso;
import cl.awakelab.miprimerspring0057.repository.ICursoRepository;
import cl.awakelab.miprimerspring0057.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements ICursoService {
    @Autowired
    ICursoRepository objCursoRepo;
    @Override
    public List<Curso> listarCurso() {
        List<Curso> listarCurso = new ArrayList<>();
        listarCurso = objCursoRepo.findAll();
        return listarCurso;
    }

    @Override
    public Curso listarCursoId(int idCurso) {
        return objCursoRepo.findById(idCurso).orElse(null);
    }

    @Override
    public Curso crearCurso(Curso curso) {
        Curso nuevoCurso = new Curso();
        nuevoCurso = objCursoRepo.save(curso);
        return nuevoCurso;
    }

    @Override
    public Curso actualizarCurso(int id, Curso cursoActualizar) {
        Curso cursoEncontrado = objCursoRepo.findById(id).orElse(null);
        cursoEncontrado.setNombreCurso(cursoActualizar.getNombreCurso());
        cursoEncontrado.setListaAlumnos(cursoActualizar.getListaAlumnos());
        cursoEncontrado.setListaProfesores(cursoActualizar.getListaProfesores());
        return objCursoRepo.save(cursoEncontrado);
    }

    @Override
    public void eliminarCurso(int idCurso) {
        objCursoRepo.deleteById(idCurso);
    }

    @Override
    public void eliminarCursoId(Curso cursoEliminado) {
        objCursoRepo.delete(cursoEliminado);
    }
}
