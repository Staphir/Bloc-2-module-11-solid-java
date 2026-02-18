package fr.visiplus.exercice.repository;

import java.util.Comparator;
import java.util.List;

import fr.visiplus.exercice.User;

public class UserRepositoryImpl implements IUserRepository {

	private final Comparator<User> userComparator;

	public UserRepositoryImpl(Comparator<User> userComparator) {
		this.userComparator = userComparator;
	}

	@Override
	public List<User> sortUsers(List<User> users) throws Exception {
		users.sort(userComparator);
		return users;
	}
}
