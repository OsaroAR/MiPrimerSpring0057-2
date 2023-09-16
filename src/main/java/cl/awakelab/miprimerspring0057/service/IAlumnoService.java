package cl.awakelab.miprimerspring0057.service;

import cl.awakelab.miprimerspring0057.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    public List<Alumno> listarAlumno();
    public Alumno listarAlumnoId(int idAlumno);
    public Alumno crearAlumno(Alumno alumno);
    public Alumno actualizarAlumno(int id, Alumno alumno);
    public void eliminarAlumno(int idAlumno);
    public void eliminarAlumnoId(Alumno alumnoEliminado);
}
