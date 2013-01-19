package ua.com.ups.service;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.ups.dao.UserDAO;
import ua.com.ups.dao.UserRoleDAO;
import ua.com.ups.entity.User;
import ua.com.ups.entity.UserRole;

/**
 * @author Alex.Barchuk
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;
    private UserRoleDAO userRoleDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, UserRoleDAO userRoleDAO){
        this.userDAO = userDAO;
        this.userRoleDAO = userRoleDAO;
    }

    @Override
    public User add(User user) {
        Validate.notNull(user, "user shouldn't be null");
        return userDAO.save(user);
    }

    @Override
    public User find(long id) {
        Validate.notNull(id, "id shouldn't be null");
        return userDAO.getById(id);
    }

    @Override
    public User edit(User user) {
        Validate.notNull(user, "user shouldn't be null");
        userDAO.update(user);

        return user;
    }

    @Override
    public UserRole getRole(String name) {
        Validate.notEmpty(name, "name shouldn't be empty");
        Validate.notNull(name, "name shouldn't be null");

        return userRoleDAO.getByName(name);
    }

    @Override
    public User getUserByEmail(String email) {
        Validate.notEmpty(email, "email shouldn't be empty");
        Validate.notNull(email, "email shouldn't be null");

        return userDAO.getByEmail(email);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
