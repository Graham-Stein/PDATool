package com.example.PDATool.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name= "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column
    private String cohort;

//    private List <Module> modules;

    public Student(String firstName, String lastName, String cohort) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.modules = new ArrayList<>();
        this.cohort = cohort;
    }

    public Student() {
    }
//
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Module> getModules() {
//        return modules;
//    }

//    public void setModules(List<Module> modules) {
//        this.modules = modules;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
