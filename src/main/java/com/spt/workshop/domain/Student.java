package com.spt.workshop.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Student {

    /**
     */
    private String firstname;

    /**
     */
    private String lastname;

    /**
     */
    private Integer age;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Address> addresses = new HashSet<Address>();
}
