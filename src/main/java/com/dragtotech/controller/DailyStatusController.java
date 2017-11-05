package com.dragtotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.JAXBException;

/**
 * Controller class to handle Home Page interactions
 */
@Controller
public class DailyStatusController {

   @PostMapping("/DailyBurndown")
    public String singleFileUpload(@RequestParam("inputXML") String inputXML) throws JAXBException {
       if(null!=inputXML && inputXML.length()>0){
           //de.parseSprintIssuesXML(inputXML);
       }
       return "HomePage";
   }
}