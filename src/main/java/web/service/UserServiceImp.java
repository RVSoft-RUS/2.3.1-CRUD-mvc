package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDaoImp userDao;

   @Transactional
   @Override
   public boolean addUser(User user) {
      userDao.addUser(user);
      return  true;
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }

   @Transactional
   @Override
   public boolean deleteUser(User user) {
      userDao.deleteUser(user);
      return true;
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserById(long id) {
      return userDao.getUserById(id);
   }

   @Transactional
   @Override
   public boolean updateUser(User user) {
      userDao.updateUser(user);
      return true;
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserByLoginPass(String login, String password) {
      return userDao.getUserByLoginPass(login, password);
   }

   @Transactional(readOnly = true)
   @Override
   public boolean isExistLogin(String login) {
      return userDao.isExistLogin(login);
   }

//   @Transactional(readOnly = true)
//   @Override
//   public User findUserByCarSeries(int series) {
//      return userDao.findUserByCarSeries(series);
//   }
//
//   public boolean deleteUserById(long id) {
//      try {
//         userDao.deleteUserById(id);
//         return true;
//      } catch (DAOException e) {
//         return false;
//      }
//   }
//
//   public User getUserById(long id) {
//      try {
//         return userDao.getUserById(id);
//      } catch (DAOException e) {
//         return null;
//      }
//   }
//
//   public boolean updateUser(User user) {
//      try {
//         userDao.updateUser(user);
//         return true;
//      } catch (DAOException e) {
//         return false;
//      }
//   }
//
//   public User getUserByLoginPass(String login, String password) {
//      try {
//         return userDao.getUserByLoginPass(login, password);
//      } catch (DAOException e) {
//         return null;
//      }
//   }
//
//   public boolean isExistLogin(String login) {
//      try {
//         return userDao.isExistLogin(login);
//      } catch (DAOException e) {
//         return false;
//      }
//   }
}
