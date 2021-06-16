package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUsersService {
    public User selectUser(int id);
    public List<User> selectAllUser();
    public boolean deleteUser(int id) throws SQLException;
    public  boolean updateUser(User user) throws SQLException;
}


