package com.spt.workshop.web;
import com.spt.workshop.domain.Address;
import com.spt.workshop.domain.Student;
import org.apache.log4j.Logger;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.*;

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

    @RequestMapping(value = "/create", produces = "text/html",method = RequestMethod.POST)
    public String createController(@Valid Student std, @Valid Address add, Model model){
        logger.info("Create Student Controller");
        try {
            Student student = new Student();
            logger.info("First Name : " + std.getFirstname());
            student.setFirstname(std.getFirstname());
            logger.info("Last Name : " + std.getLastname());
            student.setLastname(std.getLastname());
            logger.info("Age : " + std.getAge());
            student.setAge(std.getAge());

            Address address = new Address();
            address.setVillage(add.getVillage());
            logger.info("Village : " + add.getVillage());
            address.setHouseNo(add.getHouseNo());
            logger.info("House No. : " +  add.getHouseNo());
            address.setRoad(add.getRoad());
            logger.info("Road : " + add.getRoad());

            Set<Address> addressSet = new HashSet<Address>();
            addressSet.add(address);

            address.setStudent(student);
            student.setAddresses(addressSet);
            logger.info("Student : " + student);
            logger.info("Student address : " + student.getAddresses());
            logger.info("Address : " + address);
            logger.info("Address student : " + address.getStudent());

            address.persist();
            student.persist();

        }catch (Exception e){
            logger.error("Can't insert data to Student");
            logger.error(e);
        }



        return "testgit/create";
    }
}