package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;
import fr.visiplus.exercice.repository.IUserRepository;

public class SortUserServiceImpl implements ISortUserService {

	private final IUserRepository userRepositoryImplementation;

    public SortUserServiceImpl(IUserRepository userRepositoryImplementation) {
        this.userRepositoryImplementation = userRepositoryImplementation;
    }

	@Override
	public List<User> sortUsersByUsername(List<User> users) throws Exception {
		return userRepositoryImplementation.sortUsers(users);
	}

}
