package ua.com.ups.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.com.ups.entity.*;

import javax.annotation.Resource;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDAOTest {

    @Resource
    UserDAO userDAO;

    @Test
    public void testGetUserByEmail() throws Exception {
        String email = "user1aiksssi@mail.com";
        User user = userDAO.getByEmail(email);

        Assert.assertNotNull(user);
        Assert.assertEquals(email, user.getEmail());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userDAO.getById(1);
        user.setPassword("123456789");
        boolean updateUser = userDAO.update(user);

        Assert.assertEquals(true, updateUser);
        Assert.assertEquals("123456789", user.getPassword());
    }
}
