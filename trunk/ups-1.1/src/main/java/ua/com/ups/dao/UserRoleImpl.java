package ua.com.ups.dao;

import org.springframework.stereotype.Controller;
import ua.com.ups.entity.UserRole;
import ua.com.ups.entity.enums.UserRoleEnum;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The UserRole DAO bean.
 *
 * @author Alex.Barchuk
 * Date: 12/14/12
 */

@Controller
public class UserRoleImpl implements UserRoleDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public UserRole getByName(String nameRole) {
        TypedQuery<UserRole> query =  em.createNamedQuery("UserRole.getByName", UserRole.class);
        query.setParameter("nameRole", nameRole);

        return query.getSingleResult();
    }

    @Override
    public UserRole save(UserRole userRole) { //TODO implement this
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(UserRole userRole) { //TODO implement this
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserRole getById(long id) {
        return em.find(UserRole.class, id);
    }

    @Override
    public void delete(UserRole userRole) {  //TODO implement this
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<UserRole> getAll() {
        TypedQuery<UserRole> query = em.createNamedQuery("UserRole.getAll", UserRole.class);

        return query.getResultList();
    }
}
