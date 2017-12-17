package infnet.servicosrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import infnet.servicosrest.dao.TurmaDao;
import infnet.servicosrest.model.Turma;

@Service
@Transactional
public class TurmaService {
	
	@Autowired
	private TurmaDao turmaDao;
	
	static List<Turma> turmas = new ArrayList<>();

	static {
		Turma t1 = new Turma();
		t1.setId(1);
		t1.setDescricao("Turma 1");
		Turma t2 = new Turma();
		t2.setId(2);
		t2.setDescricao("Turma 1");
		Turma t3 = new Turma();
		t3.setId(3);
		t3.setDescricao("Turma 1");
		
		turmas.add(t1);
		turmas.add(t2);
		turmas.add(t3);
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
