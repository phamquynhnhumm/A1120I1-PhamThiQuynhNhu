package service;

import model.User;
import repository.IUserRepositorylmpl;
import repository.IUsserRepository;

import java.sql.SQLException;
import java.util.List;

public class IUsersServicelmpl implements IUsersService {
    private IUsserRepository repository = new IUserRepositorylmpl();
    @Override
    public User selectUser(int id) {
        return repository.selectUser(id);
    }
    @Override
    public List<User> selectAllUser() {
        return repository.selectAllUser();
    }
    @Override
    public boolean deleteUser(int id) throws SQLException {
        return repository.deleteUser(id);
    }
    @Override
    public boolean updateUser(User user) throws SQLException {
        return repository.updateUser(user);
    }
}
