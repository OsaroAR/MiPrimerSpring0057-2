package cl.awakelab.miprimerspring0057.restcontroller;

import cl.awakelab.miprimerspring0057.entity.Alumno;
import cl.awakelab.miprimerspring0057.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoRestController {
    @Autowired
    IAlumnoService objAlumnoService;

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno){return objAlumnoService.crearAlumno(alumno);}

    @GetMapping
    public List<Alumno> listarAlumnos(){return  objAlumnoService.listarAlumno();}
}
