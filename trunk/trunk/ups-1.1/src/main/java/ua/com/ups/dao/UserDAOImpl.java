package ua.com.ups.dao;

import org.apache.commons.lang.Validate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.ups.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The User DAO bean.
 * Date: 9/27/12
 * @author Alex.Barchuk
 */

@Repository("userDao")
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = false)
    public User save(User user) {
        return em.merge(user);
    }

    @Transactional(readOnly = false)
    public boolean update(User user) {
        if(user.getId() != 0 && em.find(User.class, user.getId()) != null){
            em.merge(user);
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public User getById(long id) {
        return em.find(User.class, id);
    }

    @Transactional(readOnly = false)
    public void delete(User user) {
        em.remove(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        TypedQuery<User> query =  em.createNamedQuery("User.getUserByEmail", User.class);
        query.setParameter("email", email);

        return query.getSingleResult();
    }
}
