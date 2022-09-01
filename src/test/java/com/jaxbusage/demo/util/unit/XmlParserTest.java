package com.jaxbusage.demo.util.unit;

import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.util.XmlParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Unit test for {@link XmlParser}
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class XmlParserTest {

    private XmlParser xmlParser;
    @Before
    public void setUp(){
        xmlParser = new XmlParser();
    }

    @Test
    public void xmlParseFromStr() throws JAXBException {
        Root root = xmlParser.xmlParseFromStr();
        Assert.assertNotNull(root);
    }

    @Test
    public void xmlParseFromFile() throws JAXBException, IOException {
        Root root = xmlParser.xmlParseFromFile();
        Assert.assertNotNull(root);
    }
}
