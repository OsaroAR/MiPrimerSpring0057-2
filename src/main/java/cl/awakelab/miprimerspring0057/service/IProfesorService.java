package cl.awakelab.miprimerspring0057.service;


import cl.awakelab.miprimerspring0057.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    public List<Profesor> listarProfesor();
    public Profesor listarProfesorId(int idProfesor);
    public Profesor crearProfesor(Profesor profesor);
    public Profesor actualizarProfesor(int id, Profesor profesor);
    public void eliminarProfesor(int idProfesor);
    public void eliminarProfesorId(Profesor profesorEliminado);
}
