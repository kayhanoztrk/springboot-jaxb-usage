package com.jaxbusage.demo.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class BaseRoot {
    @XmlElement(name = "InstanceId")
    private String instanceId;
}
