package service;

import model.User;

import java.util.List;

public interface UserService {
    List<User> finAll();
    void  save(User user);
    List<User>  finByName(String name);
    User update(String id,  User user);
    void remove(String id);
    User finById1(String id);
}
