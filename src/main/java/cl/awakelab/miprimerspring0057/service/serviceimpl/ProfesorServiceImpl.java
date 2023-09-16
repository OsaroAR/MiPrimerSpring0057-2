package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Profesor;
import cl.awakelab.miprimerspring0057.repository.IProfesorRepository;
import cl.awakelab.miprimerspring0057.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("profesorServiceImpl")
public class ProfesorServiceImpl implements IProfesorService {
    @Autowired
    IProfesorRepository objProfesorRepo;

    @Override
    public List<Profesor> listarProfesor() {
        List<Profesor> listarProfesor = new ArrayList<>();
        listarProfesor = objProfesorRepo.findAll();
        return listarProfesor;
    }

    @Override
    public Profesor listarProfesorId(int idProfesor) {return objProfesorRepo.findById(idProfesor).orElse(null);}

    @Override
    public Profesor crearProfesor(Profesor profesor) {
        Profesor nuevoProfesor = new Profesor();
        nuevoProfesor = objProfesorRepo.save(profesor);
        return nuevoProfesor;
    }

    @Override
    public Profesor actualizarProfesor(int id, Profesor profesor) {
        Profesor profesorEncontrado = objProfesorRepo.findById(id).orElse(null);
        profesorEncontrado.setNombres(profesorEncontrado.getNombres());
        profesorEncontrado.setApellido1(profesorEncontrado.getApellido1());
        profesorEncontrado.setApellido2(profesorEncontrado.getApellido2());
        profesorEncontrado.setListaCursos(profesorEncontrado.getListaCursos());
        return  objProfesorRepo.save(profesorEncontrado);
    }

    @Override
    public void eliminarProfesor(int idProfesor) {objProfesorRepo.deleteById(idProfesor);}

    @Override
    public void eliminarProfesorId(Profesor profesorEliminado) {objProfesorRepo.delete(profesorEliminado);}
}
