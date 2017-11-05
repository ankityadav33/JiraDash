package com.dragtotech.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CustomField {

    @XmlElement(name = "customfieldname")
    private String customfieldname;

    @XmlElementWrapper(name = "customfieldvalues")
    @XmlElement(name = "customfieldvalue")
    private List<String> customfieldvalue;


}
