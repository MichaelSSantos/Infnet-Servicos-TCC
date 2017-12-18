package infnet.servicosrest.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import infnet.servicosrest.model.Aluno;
import infnet.servicosrest.model.Bloco;
import infnet.servicosrest.model.Curso;
import infnet.servicosrest.model.Modulo;
import infnet.servicosrest.model.Professor;
import infnet.servicosrest.model.TipoCurso;
import infnet.servicosrest.model.Turma;

@Component
@Scope(value=WebApplicationContext.SCOPE_APPLICATION)
public class TurmaBuilder {

	private static List<Turma> turmas = new ArrayList<>();
	
	public List<Turma> getTurmas(){
		return turmas;
	}
	
	public TurmaBuilder() {
		TipoCurso pos = new TipoCurso();
		pos.setId(1);
		pos.setDescricao("Pós-graudação");
		
		TipoCurso grad = new TipoCurso();
		grad.setId(2);
		grad.setDescricao("Graduação");
		
		Curso engSoftJava = new Curso();
		engSoftJava.setId(1);
		engSoftJava.setNome("Engenharia de Software com Java");
		engSoftJava.setTipoCurso(pos);
		
		Curso engSoftNet = new Curso();
		engSoftNet.setId(2);
		engSoftNet.setNome("Arquitetura de Software com .Net");
		engSoftNet.setTipoCurso(pos);
		
		/*Curso sisInf = new Curso();
		sisInf.setId(3);
		sisInf.setNome("Sistemas de informação");
		sisInf.setTipoCurso(grad);
		
		Curso engComp = new Curso();
		engComp.setId(4);
		engComp.setNome("Engenheria da computação");
		engComp.setTipoCurso(grad);*/
		
		Bloco blocoA = new Bloco();
		blocoA.setId(1);
		blocoA.setNome("Tecnologia Java");
		blocoA.setCurso(engSoftJava);
		
		/*Bloco blocoB = new Bloco();
		blocoB.setId(2);
		blocoB.setNome("Qualidade de software");
		blocoB.setCurso(sisInf);*/
		
		Bloco blocoC = new Bloco();
		blocoC.setId(3);
		blocoC.setNome("Tecnologia .Net");
		blocoC.setCurso(engSoftNet);
		
		/*Bloco blocoD = new Bloco();
		blocoD.setId(4);
		blocoD.setNome("Arquitetura de computadores");
		blocoD.setCurso(engComp);*/
		
		Modulo javaOO = new Modulo();
		javaOO.setId(1);
		javaOO.setNome("Java OO");
		javaOO.setBloco(blocoA);
		
		Modulo persistenciaJava = new Modulo();
		persistenciaJava.setId(2);
		persistenciaJava.setNome("Persistência Java");
		persistenciaJava.setBloco(blocoA);
		
		Modulo dotNetOO = new Modulo();
		dotNetOO.setId(3);
		dotNetOO.setNome(".Net OO");
		dotNetOO.setBloco(blocoC);
		
		Modulo persistenciaDotNet = new Modulo();
		persistenciaDotNet.setId(3);
		persistenciaDotNet.setNome("Persistência .Net");
		persistenciaDotNet.setBloco(blocoC);
		
		Calendar dataInicio = Calendar.getInstance();
		dataInicio.set(2017, 11, 1);
		Calendar dataFim = Calendar.getInstance();
		dataFim.set(2017, 12, 31);
		
		Turma t1 = new Turma();
		t1.setId(1);
		t1.setDescricao("Turma 1");
		t1.setDataInicio(dataInicio);
		t1.setDataFim(dataFim);
		t1.setModulo(javaOO);
		
		Professor professor1 = new Professor();
		professor1.setId(1);
		professor1.setMatricula(220);
		professor1.setNome("Pivoto Souza");
		t1.setProfessor(professor1);
		
		Aluno aluno1 = new Aluno();
		aluno1.setId(1);
		aluno1.setEmail("raffamz@gmail.com");
		aluno1.setMatricula(1210);
		aluno1.setNome("Rafael Mendes");
		aluno1.setSexo("M");
//		aluno1.setTurma(t1);
		
		Turma t2 = new Turma();
		t2.setId(2);
		t2.setDescricao("Turma 2");
		t2.setDataInicio(dataInicio);
		t2.setDataFim(dataFim);
		t2.setModulo(persistenciaJava);
		
		Professor professor2 = new Professor();
		professor2.setId(2);
		professor2.setMatricula(221);
		professor2.setNome("Diego Ritzz");
		t1.setProfessor(professor2);
		
		Aluno aluno2 = new Aluno();
		aluno2.setId(1);
		aluno2.setEmail("abiliobrio@gmail.com");
		aluno2.setMatricula(1211);
		aluno2.setNome("Abilio Rio");
		aluno2.setSexo("M");
//		aluno2.setTurma(t2);
		
		Turma t3 = new Turma();
		t3.setId(3);
		t3.setDescricao("Turma 3");
		t3.setDataInicio(dataInicio);
		t3.setDataFim(dataFim);
		t3.setModulo(dotNetOO);
		
		Professor professor3 = new Professor();
		professor3.setId(3);
		professor3.setMatricula(222);
		professor3.setNome("Thiago Alves");
		t1.setProfessor(professor3);
		
		Aluno aluno3 = new Aluno();
		aluno3.setId(3);
		aluno3.setEmail("mssantos.k2@gmail.com");
		aluno3.setMatricula(1212);
		aluno3.setNome("Michael Santos");
		aluno3.setSexo("M");
//		aluno3.setTurma(t3);
		
		t1.setAlunos(Arrays.asList(aluno1));
		t2.setAlunos(Arrays.asList(aluno2));
		t3.setAlunos(Arrays.asList(aluno3));
		
		turmas.add(t1);
		turmas.add(t2);
		turmas.add(t3);
	}
	
}
