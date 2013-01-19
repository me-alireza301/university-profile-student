package ua.com.ups.service;

import ua.com.ups.entity.UserRole;

import java.util.List;

/**
 * @author Alex.Barchuk
 * Date: 12/16/12
 */

public interface UserRoleService {

    public List<UserRole> getAllRoles();

    public UserRole getByPK(long id);

}
