package com.jaxbusage.demo.service.unit;

import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.model.User;
import com.jaxbusage.demo.service.ParserService;
import com.jaxbusage.demo.service.impl.ParserServiceImpl;
import com.jaxbusage.demo.util.XmlParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link ParserService}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class ParserServiceTest {
    private ParserService parserService;
    private XmlParser xmlParser;
    private Root root;

    @Before
    public void setUp() throws JAXBException, IOException {
        xmlParser = mock(XmlParser.class);
        parserService = new ParserServiceImpl(xmlParser);

        root = new Root();
        //root.setInstanceId("instanceId");
        root.setUserList(Arrays.asList(new User(2L,"BOB","Marley",
                Date.from(Instant.now()))));

        when(xmlParser.xmlParseFromStr()).thenReturn(root);
        when(xmlParser.xmlParseFromFile()).thenReturn(root);
    }

    @Test
    public void testParseFromFile() throws JAXBException, IOException {
        Root root = parserService.parseFromFile();
        Assert.assertNotNull(root);
    }

    @Test
    public void testParseFromStr() throws JAXBException {
        Root root = parserService.parseFromStr();
        Assert.assertNotNull(root);
    }
}
