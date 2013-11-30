package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Agenda;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Agenda agenda = (Agenda) context.getBean("agenda");
		System.out.println(agenda.getContato().getEmail());
		agenda.getContato().setNome("eveline");
		System.out.println(((Agenda) context.getBean("agenda")).getContato().getNome());
	}

}
