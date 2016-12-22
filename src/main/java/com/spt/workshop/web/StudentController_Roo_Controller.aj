// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.spt.workshop.web;

import com.spt.workshop.domain.Address;
import com.spt.workshop.domain.Student;
import com.spt.workshop.web.StudentController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect StudentController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String StudentController.create(@Valid Student student, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, student);
            return "students/create";
        }
        uiModel.asMap().clear();
        student.persist();
        return "redirect:/students/" + encodeUrlPathSegment(student.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String StudentController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Student());
        return "students/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String StudentController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("student", Student.findStudent(id));
        uiModel.addAttribute("itemId", id);
        return "students/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String StudentController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("students", Student.findStudentEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Student.countStudents() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("students", Student.findAllStudents(sortFieldName, sortOrder));
        }
        return "students/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String StudentController.update(@Valid Student student, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, student);
            return "students/update";
        }
        uiModel.asMap().clear();
        student.merge();
        return "redirect:/students/" + encodeUrlPathSegment(student.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String StudentController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Student.findStudent(id));
        return "students/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String StudentController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Student student = Student.findStudent(id);
        student.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/students";
    }
    
    void StudentController.populateEditForm(Model uiModel, Student student) {
        uiModel.addAttribute("student", student);
        uiModel.addAttribute("addresses", Address.findAllAddresses());
    }
    
    String StudentController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
