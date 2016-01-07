package info.obyrtacz.springtutorial.implementations;

import info.obyrtacz.springtutorial.api.Logger;
import info.obyrtacz.springtutorial.api.UsersRepository;
import info.obyrtacz.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;
	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika "+ name);
		return new User(name);
		
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
		// TODO Auto-generated method stub

	}

}
