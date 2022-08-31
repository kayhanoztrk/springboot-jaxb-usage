package com.jaxbusage.demo.service;

import com.jaxbusage.demo.model.Root;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface ParserService {
    Root parseFromFile() throws JAXBException, IOException;
    Root parseFromStr() throws JAXBException;
}
