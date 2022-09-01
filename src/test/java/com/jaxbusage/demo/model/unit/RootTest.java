package com.jaxbusage.demo.model.unit;

import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

/**
 * Unit test for {@link Root}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class RootTest {
    private Root root;
    @Before
    public void setUp(){
        root = new Root();
        root.setInstanceId("instanceID");
        root.setUserList(Arrays.asList(new User(1L,"Bob","Marley",Date.from(Instant.now()))));
    }

    @Test
    public void testGetter(){
        Assert.assertNotNull(root);
        Assert.assertNotNull(root.getInstanceId());
        Assert.assertNotNull(root.getUserList());
    }


}
