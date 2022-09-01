package com.jaxbusage.demo.controller.unit;

import com.jaxbusage.demo.controller.UserController;
import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.model.User;
import com.jaxbusage.demo.service.ParserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import javax.xml.bind.JAXBException;

import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.Arrays;

import static org.mockito.Mockito.*;

/**
 * Unit test for {@link UserController}
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class UserControllerTest {
    private UserController userController;
    private ParserService parserService;
    private Root root;

    @Before
    public void setUp() throws JAXBException, IOException {
        parserService = mock(ParserService.class);
        userController = new UserController(parserService);

        root = new Root();
        root.setInstanceId("instanceId");
        root.setUserList(Arrays.asList(new User(2L,"Bob",
                "Marley", Date.from(Instant.now()))));

        when(parserService.parseFromStr()).thenReturn(root);
        when(parserService.parseFromFile()).thenReturn(root);
    }

    @Test
    public void parseFromStr() throws JAXBException {
        ResponseEntity<Root> responseEntity = userController.parseFromStr();
        Assert.assertNotNull(responseEntity);
    }

    @Test
    public void parseFromFile() throws JAXBException, IOException {
        ResponseEntity<Root> responseEntity = userController.parseFromFile();
        Assert.assertNotNull(responseEntity);
    }

}
