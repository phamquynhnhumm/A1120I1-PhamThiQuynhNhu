package service;

import model.User;
import repository.UserRepository;
import repository.UserRepositorylmpl;

import java.util.List;

public class UserServicelmpl  implements UserService{
    UserRepository userRepository = new UserRepositorylmpl();
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public User finById(int id) {
        return userRepository.finById(id);
    }

    @Override
    public void update(int id, User user) {
        userRepository.update(id,user);

    }

    @Override
    public void remove(int id) {
        userRepository.remove(id);

    }
}
