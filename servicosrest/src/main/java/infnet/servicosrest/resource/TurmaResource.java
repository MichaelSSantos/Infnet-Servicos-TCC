package infnet.servicosrest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import infnet.servicosrest.model.Turma;
import infnet.servicosrest.service.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaResource {
	
	@Autowired
	private TurmaService turmaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Turma>> listar(){
		return new ResponseEntity<List<Turma>>(turmaService.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Turma> buscar(@PathVariable("id") Integer id) {
		Turma turma = turmaService.buscar(id);
	  if (turma == null) {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	  }

	  return new ResponseEntity<Turma>(turma, HttpStatus.OK);
	}
	
}
