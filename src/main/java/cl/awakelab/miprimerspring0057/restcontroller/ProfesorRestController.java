package cl.awakelab.miprimerspring0057.restcontroller;

import cl.awakelab.miprimerspring0057.entity.Profesor;
import cl.awakelab.miprimerspring0057.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorRestController {
    @Autowired
    IProfesorService objProfesorService;

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor){return objProfesorService.crearProfesor(profesor);}

    @GetMapping
    public List<Profesor> listarProfesor(){return objProfesorService.listarProfesor();}
}
