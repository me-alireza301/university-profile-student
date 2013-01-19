package ua.com.ups.service;

import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.ups.dao.UserRoleDAO;
import ua.com.ups.entity.UserRole;

import java.util.List;

/**
 * @author  Alex.Barchuk
 * Date: 12/16/12
 */

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private UserRoleDAO userRoleDAO;

    @Autowired
    public UserRoleServiceImpl(UserRoleDAO userRoleDAO){
        this.userRoleDAO = userRoleDAO;
    }

    @Override
    public List<UserRole> getAllRoles() {
        return userRoleDAO.getAll();
    }

    @Override
    public UserRole getByPK(long id) {
        Validate.notNull(id, "id shouldn't be null");
        UserRole userRole = userRoleDAO.getById(id);
        return userRole;
    }




}
