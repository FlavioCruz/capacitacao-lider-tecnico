package sti.uff.br.treinamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sti.uff.br.treinamento.service.AlunoService;
import sti.uff.br.treinamento.service.DisciplinaService;

import java.util.Collections;

@Controller
@RequestMapping("/inscricao")
public class InscricaoController {

    @Autowired
    AlunoService alunoService;

    @Autowired
    DisciplinaService disciplinaService;


    @GetMapping
    public String listarDisciplinas(Model model){
        model.addAttribute("matricula", new String());
        model.addAttribute("turmas", Collections.emptyList());
        return "listar_disciplina";
    }

    @PostMapping("/listar")
    public String listarDisciplinas(@ModelAttribute("matricula") String matricula, Model model){
        model.addAttribute("turmas", disciplinaService.obterDisciplinasPorCurso(matricula));
        model.addAttribute("matricula", matricula);
        return "listar_disciplina";
    }

    @PostMapping("/inscrever")
    public String inscreverDisciplina(@ModelAttribute("id") String id, @ModelAttribute("matricula") String matricula){
        return "tela_sucesso";
    }
}