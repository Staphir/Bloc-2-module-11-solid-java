package fr.visiplus.exercice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import fr.visiplus.exercice.repository.IUserRepository;
import fr.visiplus.exercice.repository.UserRepositoryImpl;
import fr.visiplus.exercice.service.ISortUserService;
import fr.visiplus.exercice.service.SortUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static final Logger Logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {

		Comparator<User> userComparator = new UserComparator();
		IUserRepository userRepository = new UserRepositoryImpl(userComparator);
		ISortUserService serviceImplementation = new SortUserServiceImpl(userRepository);

		List<User> userList = new ArrayList<>();
		userList.add(new User("albert", "martin", "martina", "noidea"));
		userList.add(new User("gerard", "charles", "charlesg", "idea"));


		serviceImplementation.sortUsersByUsername(userList).forEach(user -> Logger.info(user.toString()));
	}

}
