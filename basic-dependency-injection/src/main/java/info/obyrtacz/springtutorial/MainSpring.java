package info.obyrtacz.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.obyrtacz.springtutorial.api.UsersRepository;
import info.obyrtacz.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);
		
		User janek = usersRepository.createUser("jasiu");
       
	}

}
