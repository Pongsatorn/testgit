// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.spt.workshop.web;

import com.spt.workshop.domain.Address;
import com.spt.workshop.domain.Student;
import com.spt.workshop.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Address, String> ApplicationConversionServiceFactoryBean.getAddressToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.spt.workshop.domain.Address, java.lang.String>() {
            public String convert(Address address) {
                return new StringBuilder().append(address.getVillage()).append(' ').append(address.getHouseNo()).append(' ').append(address.getRoad()).toString();
            }
        };
    }
    
    public Converter<Long, Address> ApplicationConversionServiceFactoryBean.getIdToAddressConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.spt.workshop.domain.Address>() {
            public com.spt.workshop.domain.Address convert(java.lang.Long id) {
                return Address.findAddress(id);
            }
        };
    }
    
    public Converter<String, Address> ApplicationConversionServiceFactoryBean.getStringToAddressConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.spt.workshop.domain.Address>() {
            public com.spt.workshop.domain.Address convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Address.class);
            }
        };
    }
    
    public Converter<Student, String> ApplicationConversionServiceFactoryBean.getStudentToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.spt.workshop.domain.Student, java.lang.String>() {
            public String convert(Student student) {
                return new StringBuilder().append(student.getFirstname()).append(' ').append(student.getLastname()).append(' ').append(student.getAge()).toString();
            }
        };
    }
    
    public Converter<Long, Student> ApplicationConversionServiceFactoryBean.getIdToStudentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.spt.workshop.domain.Student>() {
            public com.spt.workshop.domain.Student convert(java.lang.Long id) {
                return Student.findStudent(id);
            }
        };
    }
    
    public Converter<String, Student> ApplicationConversionServiceFactoryBean.getStringToStudentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.spt.workshop.domain.Student>() {
            public com.spt.workshop.domain.Student convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Student.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAddressToStringConverter());
        registry.addConverter(getIdToAddressConverter());
        registry.addConverter(getStringToAddressConverter());
        registry.addConverter(getStudentToStringConverter());
        registry.addConverter(getIdToStudentConverter());
        registry.addConverter(getStringToStudentConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
