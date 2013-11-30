package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("agenda") // utilizar conforme o beans2.xml
public class Agenda {

	@Autowired
	private Contato contato;

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	
}
