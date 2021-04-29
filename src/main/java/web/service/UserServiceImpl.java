package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.User;
import web.UserDAO.UserDAO;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
private UserDAO userDAO;


    @Override
    public List<User> userList() {
        return userDAO.userList();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public User getById(Long id) {
        return userDAO.getById(id);
    }
}
