package com.dragtotech.model.jaxb;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "subtask")
public class SubTask {

    @XmlAttribute(name = "id")
    private String id;

    @XmlValue
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
