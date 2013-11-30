package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Agenda;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		
		Agenda agenda = (Agenda) context.getBean("agenda");
		System.out.println(agenda.getContato().getEmail());
	}
}
