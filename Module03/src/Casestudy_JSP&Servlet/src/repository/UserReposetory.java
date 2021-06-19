package repository;

import model.User;
import model.Vitri;

import java.util.List;

public interface UserReposetory {
    List<User> finAll();
    void  save(User user);
    List<User>  finByName(String name);
    User update(String id,  User user);
    void remove(String id);
    User finById1(String id);
}
