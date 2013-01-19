package ua.com.ups.dao;

import ua.com.ups.entity.User;

/**
 * User DAO
 * Date: 9/27/12
 * @author Alex.Barchuk
 */

public interface UserDAO extends DefaultDAO<User> {

    public User getByEmail(String email);

}
