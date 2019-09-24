package ru.sorochinsky.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CourseProgress {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

}
