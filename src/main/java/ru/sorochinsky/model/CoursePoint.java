//package ru.sorochinsky.model;
//
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//public class CoursePoint {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Long id;
//
//    @NotNull
//    private Float point;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "curs_fk", nullable = false)
//    private Course course;
//
//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Float getPoint() {
//        return point;
//    }
//
//    public void setPoint(Float point) {
//        this.point = point;
//    }
//}
