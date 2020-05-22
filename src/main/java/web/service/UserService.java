package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    List<User> getAllUsers();

    boolean deleteUser(User user);

    User getUserById(long id);

    boolean updateUser(User user);

    User getUserByLoginPass(String login, String password);

    boolean isExistLogin(String login);
}
