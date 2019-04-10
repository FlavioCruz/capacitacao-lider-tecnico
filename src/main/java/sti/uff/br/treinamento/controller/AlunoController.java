package sti.uff.br.treinamento.controller;


import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sti.uff.br.treinamento.service.AlunoService;

import java.util.List;
import java.util.Optional;

@Controller
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

    @GetMapping(value = "/matricula", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Aluno> obterAlunoPorMatricula(@RequestParam("matricula") String matricula){
        return Optional.ofNullable(alunoService.obterAlunoPorMatricula(matricula))
                .map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.badRequest()
                        .body(null
                        )
                );

    }

    @GetMapping(value = "/curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aluno>> obterAlunoPorCurso(@RequestParam("matricula") String matricula){
        return Optional.ofNullable(alunoService.obterAlunosPorCurso(matricula))
                .map(ResponseEntity :: ok)
                .orElseGet(() -> ResponseEntity.badRequest()
                        .body(null
                        )
                );

    }

    @GetMapping(value="/listar", produces = MediaType.TEXT_HTML_VALUE)
    public String main(Model model){
        model.addAttribute("alunos", alunoService.obterAlunosPorCurso("113031015"));

        return "listar_aluno";
    }
}
