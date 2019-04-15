package sti.uff.br.treinamento.service;

import br.uff.sti.graduacao.academico.model.Disciplina;
import br.uff.sti.graduacao.academico.model.Turma;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sti.uff.br.treinamento.data.DisciplinasDAO;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
public class DisciplinaServiceTest {

    @Autowired
    private DisciplinaService service;

    private static final DisciplinasDAO disciplinasDAO = mock(DisciplinasDAO.class);

    /*
        Mocks da entidade
     */

    private Disciplina d1 = new Disciplina();
    private Turma t1 = new Turma(1L, "A1", ANO_SEMESTRE);
    private Turma t2 = new Turma(2L, "B1", ANO_SEMESTRE);
    private Turma t3 = new Turma(3L, "C1", ANO_SEMESTRE);
    private List<Turma> turmas = Arrays.asList(t1, t2, t3);
    private static final String MATRICULA = "MATRICULA";
    private static final Integer ANO_SEMESTRE = 20191;

    @Before
    public void setup(){
        d1.setCodigo("cod1");
        d1.setIdDisciplina(1l);
        t1.setDisciplina(d1);
        t2.setDisciplina(d1);
        t3.setDisciplina(d1);
        service.setMockDAO(disciplinasDAO);
    }

    @After
    public void unset(){
        service.unsetMockDAO();
    }


    @Test
    public void verifica_busca_disciplina_por_codigo(){
        service.obterDisciplinaPorCodigo(d1.getCodigo());
        verify(service, times(1)).obterDisciplinaPorCodigo(d1.getCodigo());
    }

    @Test
    public void verifica_busca_disciplina_por_curso(){
        service.obterDisciplinasPorCurso(MATRICULA, ANO_SEMESTRE);
        verify(service, times(1)).obterDisciplinasPorCurso(MATRICULA, ANO_SEMESTRE);
    }
}
