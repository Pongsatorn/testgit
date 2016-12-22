package com.spt.workshop.web;
import com.spt.workshop.domain.Student;
import org.apache.log4j.Logger;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RooJavaBean
@RooToString
@RequestMapping("/testgit")
@Controller
public class Student_Custom_Controller {

    Logger logger = Logger.getLogger(Student_Custom_Controller.class);

    @RequestMapping(value = "/create", produces = "text/html")
    public String createView( Model uiModel) {
        logger.info("Create Form View");
        return "testgit/create";
    }
}