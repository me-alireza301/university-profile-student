package ua.com.ups.dao;

import ua.com.ups.entity.UserRole;

/**
 * UserRole
 *
 * @author Alex.Barchuk
 * Date: 12/14/12
 */
public interface UserRoleDAO extends DefaultDAO<UserRole> {

    public UserRole getByName(String nameRole);

}
