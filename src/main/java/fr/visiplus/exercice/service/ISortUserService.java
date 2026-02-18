package fr.visiplus.exercice.service;

import java.util.List;

import fr.visiplus.exercice.User;

public interface ISortUserService {

	List<User> sortUsersByUsername(List<User> users) throws Exception;

}
