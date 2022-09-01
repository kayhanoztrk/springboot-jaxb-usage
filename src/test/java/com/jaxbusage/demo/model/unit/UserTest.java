package com.jaxbusage.demo.model.unit;

import com.jaxbusage.demo.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.time.Instant;

/**
 * Unit test for {@link User}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class UserTest {
    private User user;
    @Before
    public void setUp(){
        user = new User();
        user.setId(1L);
        user.setName("Bob");
        user.setSurname("Marley");
        user.setBirthDate(Date.from(Instant.now()));
    }

    @Test
    public void testGetter(){
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getName());
        Assert.assertNotNull(user.getSurname());
        Assert.assertNotNull(user.getBirthDate());
    }
}
