package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    User finById( int id);
    void update(int id,User user);
    void remove(int id);
}
