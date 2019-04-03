package sti.uff.br.treinamento.controller;


import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sti.uff.br.treinamento.service.AlunoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Aluno> obterTodosALunos(){
        return Optional.ofNullable(alunoService.obterTodosAlunos())
                .map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.badRequest()
                        .body(null
                        )
                );

    }

    @GetMapping(value = "matricula", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Aluno> obterAlunoPorMatricula(@RequestParam("matricula") String matricula){
        return Optional.ofNullable(alunoService.obterAlunoPorMatricula(matricula))
                .map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.badRequest()
                        .body(null
                        )
                );

    }

    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aluno>> obterAlunoPorCurso(@RequestParam("codigo_curso") String codigoCurso){
        return Optional.ofNullable(alunoService.obterAlunosPorCurso(codigoCurso))
                .map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.badRequest()
                        .body(null
                        )
                );

    }
}
