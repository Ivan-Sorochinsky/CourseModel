package ru.sorochinsky.model;


import javax.persistence.*;

@Entity
public class CoursePoint {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", nullable = false)
    private CoursePoint point;

    public CoursePoint getPoint() {
        return point;
    }

    public void setPoint(CoursePoint point) {
        this.point = point;
    }
}
