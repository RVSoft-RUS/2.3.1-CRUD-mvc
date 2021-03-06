package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    //   void add(User user);
//   List<User> listUsers();
//   void delete(User user);
//   User findUserByCarSeries(int series);
    void addUser(User user);
    List<User> getAllUsers();
    void deleteUser(User user);

    User getUserById(long id);



    void updateUser(User user);

    User getUserByLoginPass(String login, String password);

    boolean isExistLogin(String login);
}
