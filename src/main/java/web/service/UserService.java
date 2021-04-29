package web.service;

import web.Model.User;

import java.util.List;

public interface UserService {

    List<User> userList();
    void save(User user);
    void delete(User user);
    User getById(Long id);

}
