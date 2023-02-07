package mvc_hibernate_aop.mvc_hibernate_dao;

import mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

   public void deleteUser(int id);

   public void updateUser(int id, User user);
}
