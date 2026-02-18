package fr.visiplus.exercice.repository;

import fr.visiplus.exercice.User;

import java.util.List;

public interface IUserRepository {
    
    List<User> sortUsers(List<User> users) throws Exception;

}
