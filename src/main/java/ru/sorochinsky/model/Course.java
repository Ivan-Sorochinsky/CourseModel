package ru.sorochinsky.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Integer number;

    @NotNull
    private Float cost;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "point")
    private Set<CoursePoint> pointList = new HashSet<>();

    public Set<CoursePoint> getPointList() {
        return pointList;
    }

    public void setPointList(Set<CoursePoint> pointList) {
        this.pointList = pointList;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    //Add student
    public void addStudent(Student student){

    }
    //Delete student
    public void deleteStudent(Student student){

    }
}
