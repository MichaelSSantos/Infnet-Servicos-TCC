package infnet.servicosrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import infnet.servicosrest.builder.TurmaBuilder;
import infnet.servicosrest.model.Turma;

@Service
@Transactional
public class TurmaService {
	
	@Autowired
	private TurmaBuilder turmaBuilder;

	public List<Turma> listar() {
		return turmaBuilder.getTurmas();
	}

	public Turma buscar(Integer id) {
		
		for (Turma turma : listar()) {
			if(turma.getId().equals(id)) {
				return turma;
			}
		}
		return null;
	}
	
	
}
