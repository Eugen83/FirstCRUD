package web.UserDAO;

import org.springframework.stereotype.Component;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> userList() {

        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }


    @Override
    public void save(User user) {
        User saved = entityManager.merge(user);
        entityManager.persist(saved);
    }

    @Override
    public void delete(User user) {
        User del = entityManager.merge(user);
        entityManager.remove(del);
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
}
