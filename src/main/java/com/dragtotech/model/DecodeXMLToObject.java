package com.dragtotech.model;

import com.dragtotech.model.IssuesRepository;
import com.dragtotech.model.jaxb.Item;
import com.dragtotech.model.jaxb.RSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class DecodeXMLToObject {

    @Autowired
    public IssuesRepository repository;

    public void parseSprintIssuesXML(String inputXML) throws JAXBException {
      /*  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new InputSource( new StringReader( inputXML));

        //optional, but recommended
        //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();*/

        JAXBContext jc = JAXBContext.newInstance(RSS.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        System.out.println("Parsed");
        RSS rss = (RSS) unmarshaller.unmarshal(new InputSource(new StringReader(inputXML)));

       /* Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(fosterHome, System.out);*/
        repository.deleteAll();

        // save a couple of customers

        for (Item item : rss.getChannel().getItemList()) {
            repository.save(item);
        }
    }
}
