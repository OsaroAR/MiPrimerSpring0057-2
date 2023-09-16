package cl.awakelab.miprimerspring0057.service.serviceimpl;

import cl.awakelab.miprimerspring0057.entity.Alumno;
import cl.awakelab.miprimerspring0057.repository.IAlumnoRepository;
import cl.awakelab.miprimerspring0057.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("alumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    IAlumnoRepository objAlumnoRepo;
    @Override
    public List<Alumno> listarAlumno() {
        List<Alumno> listarAlumno = new ArrayList<>();
        listarAlumno = objAlumnoRepo.findAll();
        return listarAlumno;
    }

    @Override
    public Alumno listarAlumnoId(int idAlumno) {
        return objAlumnoRepo.findById(idAlumno).orElse(null);
    }

    @Override
    public Alumno crearAlumno(Alumno alumno) {
        Alumno nuevoAlumno = new Alumno();
        nuevoAlumno = objAlumnoRepo.save(alumno);
        return nuevoAlumno;
    }

    @Override
    public Alumno actualizarAlumno(int id, Alumno alumno) {
        Alumno alumnoEncontrado = objAlumnoRepo.findById(id).orElse(null);
        alumnoEncontrado.setNombres(alumnoEncontrado.getNombres());
        alumnoEncontrado.setApellido1(alumnoEncontrado.getApellido1());
        alumnoEncontrado.setApellido2(alumnoEncontrado.getApellido2());
        alumnoEncontrado.setCurso(alumnoEncontrado.getCurso());
        return objAlumnoRepo.save(alumnoEncontrado);
    }

    @Override
    public void eliminarAlumno(int idAlumno) {objAlumnoRepo.deleteById(idAlumno);}

    public void eliminarAlumnoId(Alumno alumnoEliminado) {objAlumnoRepo.delete(alumnoEliminado);}
}
