package info.obyrtacz.springtutorial.api;

import info.obyrtacz.springtutorial.domain.User;

public interface UsersRepository {
	
	User createUser(String name);
	void setLogger(Logger logger);

}
