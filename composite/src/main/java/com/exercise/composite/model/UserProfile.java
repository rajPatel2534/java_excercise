package com.exercise.composite.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author raj
 */
@Entity
@Table(
        name = "UserProfile",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"name", "mobile"})
        }
)

public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "mobile", length = 10)
    private String mobile;

    public UserProfile() {
    }

    public UserProfile(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + '}';
    }

}
