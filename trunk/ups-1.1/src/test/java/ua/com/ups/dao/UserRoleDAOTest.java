package ua.com.ups.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.com.ups.entity.UserRole;
import ua.com.ups.entity.enums.UserRoleEnum;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserRoleDAOTest  {    //First Commit

    @Resource
    UserRoleDAO userRoleDAO;

    @Test
    public void testGetUserRoleByNameByStudent() throws Exception {
        UserRole userRole = userRoleDAO.getByName(UserRoleEnum.STUDENT.value());

        Assert.assertNotNull(userRole);
        Assert.assertEquals(userRole.getAuthority(), UserRoleEnum.STUDENT.value());
    }

    @Test
    public void testGetUserRoleByNameByTeacher() throws Exception {
        UserRole userRole = userRoleDAO.getByName(UserRoleEnum.TEACHER.value());

        Assert.assertNotNull(userRole);
        Assert.assertEquals(userRole.getAuthority(), UserRoleEnum.TEACHER.value());
    }

    @Test
    public void testGetAll() throws Exception {
        List<UserRole> userRoles = userRoleDAO.getAll();

        Assert.assertNotNull(userRoles);
        Assert.assertTrue(userRoles.size() > 0);
    }

    @Test
    public void testGetById() throws Exception {
        UserRole userRole = userRoleDAO.getById(2);

        Assert.assertNotNull(userRole);
        Assert.assertEquals("ROLE_TEACHER", userRole.getAuthority());
    }
}
