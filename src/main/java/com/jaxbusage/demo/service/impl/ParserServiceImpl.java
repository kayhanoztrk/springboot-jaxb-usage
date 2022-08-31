package com.jaxbusage.demo.service.impl;

import com.jaxbusage.demo.controller.UserController;
import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.service.ParserService;
import com.jaxbusage.demo.util.XmlParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public class ParserServiceImpl implements ParserService {
    private final Logger logger = LoggerFactory.getLogger(ParserServiceImpl.class);
    private final XmlParser xmlParser;

    public ParserServiceImpl(XmlParser xmlParser){
        this.xmlParser = xmlParser;
    }

    @Override
    public Root parseFromFile() throws JAXBException, IOException {
        Root root = xmlParser.xmlParseFromFile();
        return root;
    }

    @Override
    public Root parseFromStr() throws JAXBException {
        Root root = xmlParser.xmlParseFromStr();
        return root;
    }
}
