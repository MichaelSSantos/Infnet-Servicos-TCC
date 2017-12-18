package infnet.servicosrest.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import infnet.servicosrest.dao.TurmaDao;
import infnet.servicosrest.model.Aluno;
import infnet.servicosrest.model.Bloco;
import infnet.servicosrest.model.Curso;
import infnet.servicosrest.model.Professor;
import infnet.servicosrest.model.TipoCurso;
import infnet.servicosrest.model.Turma;

@Service
@Transactional
public class TurmaService {
	
	@Autowired
	private TurmaDao turmaDao;
	
	static List<Turma> turmas = new ArrayList<>();

	static {
		TipoCurso pos = new TipoCurso();
		pos.setId(1);
		pos.setDescricao("Pós-graudação");
		
		TipoCurso grad = new TipoCurso();
		grad.setId(2);
		grad.setDescricao("Graduação");
		
		Curso engSoft = new Curso();
		engSoft.setId(1);
		engSoft.setNome("Engenharia de Software");
		engSoft.setTipoCurso(pos);
		
		Curso arqSoft = new Curso();
		arqSoft.setId(2);
		arqSoft.setNome("Arquitetura de Software");
		arqSoft.setTipoCurso(pos);
		
		Curso sisInf = new Curso();
		sisInf.setId(3);
		sisInf.setNome("Sistemas de informação");
		sisInf.setTipoCurso(grad);
		
		Curso engComp = new Curso();
		engComp.setId(4);
		engComp.setNome("Engenheria da computação");
		engComp.setTipoCurso(grad);
		
		Bloco blocoA = new Bloco();
		blocoA.setId(1);
		blocoA.setNome("Processos ágeis");
		blocoA.setCurso(engComp);
		
		Bloco blocoB = new Bloco();
		blocoB.setId(2);
		blocoB.setNome("Qualidade de software");
		blocoB.setCurso(sisInf);
		
		Bloco blocoC = new Bloco();
		blocoC.setId(3);
		blocoC.setNome("Arquitetura aplicada");
		blocoC.setCurso(arqSoft);
		
		Bloco blocoD = new Bloco();
		blocoD.setId(4);
		blocoD.setNome("Arquitetura de computadores");
		blocoD.setCurso(engComp);
		
		Calendar dataInicio = Calendar.getInstance();
		dataInicio.set(2017, 12, 18);
		Calendar dataFim = Calendar.getInstance();
		dataFim.set(2017, 12, 22);
		
		Turma t1 = new Turma();
		t1.setId(1);
		t1.setDescricao("Turma 1");
		t1.setDataInicio(dataInicio);
		t1.setDataFim(dataFim);
		
		Professor professor = new Professor();
		professor.setId(1);
		professor.setMatricula(220);
		professor.setNome("João Silva");
		t1.setProfessor(professor);
		
		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.setEmail("raffamz@gmail.com");
		aluno.setMatricula(1210);
		aluno.setNome("Rafael Mendes");
		aluno.setSexo("M");
		aluno.setTurma(t1);
		
		
		turmas.add(t1);
	}
	
	public void salvar(Turma turma) {
		turmaDao.salvar(turma);
	}

	public List<Turma> listar() {
		
		return turmas;
	}

	public Turma buscar(Integer id) {
		
		for (Turma turma : turmas) {
			if(turma.getId().equals(id)) {
				return turma;
			}
		}
		return null;
//		return turmaDao.buscar(id);
	}
	
	
}
