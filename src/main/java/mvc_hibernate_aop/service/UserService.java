package mvc_hibernate_aop.service;

import mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void updateUser(int id, User user);

   public void deleteUser(int id);
}


