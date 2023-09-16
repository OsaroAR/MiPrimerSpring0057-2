package cl.awakelab.miprimerspring0057.service;

import cl.awakelab.miprimerspring0057.entity.Curso;

import java.util.List;

public interface ICursoService {
    public List<Curso> listarCurso();
    public Curso listarCursoId(int idCurso);
    public Curso crearCurso(Curso curso);
    public Curso actualizarCurso(int id,Curso cursoActualizar);
    public void eliminarCurso(int idCurso);
    public void eliminarCursoId(Curso cursoEliminado);

}
