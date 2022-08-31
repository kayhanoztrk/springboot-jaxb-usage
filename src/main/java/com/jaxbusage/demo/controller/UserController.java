package com.jaxbusage.demo.controller;

import com.jaxbusage.demo.model.Root;
import com.jaxbusage.demo.service.ParserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/user/parse")
public class UserController {
    private final ParserService parserService;
    public UserController(ParserService parserService){
        this.parserService = parserService;
    }

    @GetMapping("/fromStr")
    public ResponseEntity<Root> parseFromStr() throws JAXBException {
        Root root = parserService.parseFromStr();
        return ResponseEntity.ok(root);
    }

    @GetMapping("/fromFile")
    public ResponseEntity<Root> parseFromFile() throws JAXBException, IOException {
        Root root = parserService.parseFromFile();
        return ResponseEntity.ok(root);
    }
}
