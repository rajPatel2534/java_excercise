package com.hibernateExc.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 *
 * @author raj
 */

@Entity
@Table(name = "student_demo")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "prefix", length = 4)
    private String prefix;

    @Column(name = "suffix", length = 4)
    private String suffix;

    @Column(name = "email", length = 50)
    @Email
    private String email;

    @Column(name = "phone", length = 10)
    private String phone;

    @Embedded
    @Column(name = "address")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_id", referencedColumnName = "id")
    private Education education;

    public Student() {
    }

    public Student(String name, String prefix, String suffix, String email, String phone, Address address, Education education) {
        this.name = name;
        this.prefix = prefix;
        this.suffix = suffix;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.education = education;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
