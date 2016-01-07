package info.obyrtacz.springtutorial;

import info.obyrtacz.springtutorial.api.Logger;
import info.obyrtacz.springtutorial.api.UsersRepository;
import info.obyrtacz.springtutorial.domain.User;
import info.obyrtacz.springtutorial.implementations.LoggerImpl;
import info.obyrtacz.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Franek");
		

	}

}
