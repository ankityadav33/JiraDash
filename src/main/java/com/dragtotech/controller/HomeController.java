package com.dragtotech.controller;

import com.dragtotech.model.DecodeXMLToObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;

/**
 * Controller class to handle Home Page interactions
 */
@ComponentScan
@Controller
public class HomeController {

    @Autowired
    public DecodeXMLToObject decodeXMLToObject;

    /*@Autowired
    private DecodeXMLToObject decodeXMLToObject;*/

    /**
     * Controller method to get called initially to display the HomePage
     *
     * @return PageName - Next page to be displayed
     */
    @RequestMapping("/")
    public String loadHome() {
        return "HomePage";
    }

    /**
     * Controller method to get called when submit is clicked on the HomePage
     *
     * @param url   - input URL to be checked for issues
     * @param model - context that will be used to return data to the frontend
     * @return PageName - Next page to be displayed
     */
   /* @GetMapping("/checkAccessibility")
    public String getAccessibilityResults(@ModelAttribute InputURL url, Map<String, Object> model) {
        AccessibilityChecker accessibilityChecker = new AccessibilityChecker();
        model.put("accessibilityErrors", accessibilityChecker.getAccessibilityErrors(url));
        return "HomePage";
    }*/

   @PostMapping("upload")
    public String singleFileUpload(@RequestParam("inputXML") String inputXML) throws JAXBException {
       if(null!=inputXML && inputXML.length()>0){
           decodeXMLToObject.parseSprintIssuesXML(inputXML);
       }
       return "HomePage";
   }


    @PostMapping("taskBurnDown")
    public String taskBurndown(@RequestParam("inputXML") String inputXML) throws JAXBException {
        if(null!=inputXML && inputXML.length()>0){
            decodeXMLToObject.parseSprintIssuesXML(inputXML);
        }
        return "HomePage";
    }
}
