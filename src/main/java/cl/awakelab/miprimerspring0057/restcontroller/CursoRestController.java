package cl.awakelab.miprimerspring0057.restcontroller;

import cl.awakelab.miprimerspring0057.entity.Curso;
import cl.awakelab.miprimerspring0057.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoRestController {
    @Autowired
    ICursoService objCursoService;

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso){
        return  objCursoService.crearCurso(curso);
    }

    @GetMapping
    public List<Curso> listarCursos(){
        return  objCursoService.listarCurso();
    }

}
