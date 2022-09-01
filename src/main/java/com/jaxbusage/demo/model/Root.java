package com.jaxbusage.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * UserController Sample XmlParser with JaxB
 *
 * @author Kayhan Ozturk
 * @version 0.1
 * @since 0.1
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Root extends BaseRoot {
    @XmlElement(name = "Xuser")
    private List<User> userList;
}
