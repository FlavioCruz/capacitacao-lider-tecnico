package sti.uff.br.treinamento.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sti.uff.br.treinamento.data.AlunosDAO;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class AlunoServiceTest {
    @Autowired
    private AlunoService service;

    private static final AlunosDAO disciplinasDAO = mock(AlunosDAO.class);

    private static final String MATRICULA = "MATRICULA";

    @Before
    public void setup(){
        service.setMockDAO(disciplinasDAO);
    }

    @After
    public void unset(){
        service.unsetMockDAO();
    }

    @Test
    public void verifica_chamar_obter_todos(){
        service.obterTodosAlunos();
        verify(service, times(1)).obterTodosAlunos();
    }

    @Test
    public void verifica_chamar_obter_aluno_por_matricula(){
        service.obterAlunoPorMatricula(MATRICULA);
        verify(service, times(1)).obterTodosAlunos();
    }

    @Test
    public void verifica_chamar_obter_alunos_por_curso(){
        service.obterAlunosPorCurso(MATRICULA);
        verify(service, times(1)).obterTodosAlunos();
    }
}
