package ru.sorochinsky.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;

    private String phone;

    private String email;

    private Integer number_gradebook;

    private Float average_performance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumber_gradebook() {
        return number_gradebook;
    }

    public void setNumber_gradebook(Integer number_gradebook) {
        this.number_gradebook = number_gradebook;
    }

    public Float getAverage_performance() {
        return average_performance;
    }

    public void setAverage_performance(Float average_performance) {
        this.average_performance = average_performance;
    }
}