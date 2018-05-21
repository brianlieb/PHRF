package org.seasailing.db.hibernate;

import java.util.Set;

public class Course {
    private Integer courseId;
    private Double distance;
    private String description;
    private String name;
    private Club club;
    private Set<Complete> completed;

    public Course() {}

    public Course(Integer courseId, Double distance, String description, String name, Club club, Set<Complete> completed) {
        this.courseId = courseId;
        this.distance = distance;
        this.description = description;
        this.name = name;
        this.club = club;
        this.completed = completed;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Set<Complete> getCompleted() {
        return completed;
    }

    public void setCompleted(Set<Complete> completed) {
        this.completed = completed;
    }
}
