package com.jaxbusage.demo.util;

import com.jaxbusage.demo.model.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

@Component
public class XmlParser {

    private final Logger logger = LoggerFactory.getLogger(XmlParser.class);
    public Root xmlParseFromStr() throws JAXBException {
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<root>\n" +
                "<InstanceId>12345</InstanceId>\n" +
                "  <Xuser>\n" +
                "    <id>1</id>\n" +
                "    <name>Cliff</name>\n" +
                "    <surname>Burton</surname>\n" +
                "    <birthDate>1965-05-19</birthDate>\n" +
                "  </Xuser>\n" +
                "  <Xuser>\n" +
                "    <id>2</id>\n" +
                "    <name>Kirk</name>\n" +
                "    <surname>Hammet</surname>\n" +
                "    <birthDate>1956-05-19</birthDate>\n" +
                "  </Xuser>\n" +
                "</root>";
        JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(new StringReader(xmlStr));
        return root;
    }

    public Root xmlParseFromFile() throws JAXBException, IOException {

        File file = ResourceUtils.getFile("classpath:user.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(file);
        return root;
    }

}
