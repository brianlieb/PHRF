package org.seasailing.db.hibernate;


import java.util.Set;

public class Club {
    private Integer clubId;
    private String club;
    private String clubEmail;
    private String handicapper;
    private String handicapperEmail;
    private String handicapperPhone;
    private Integer denominator;
    private String type;

    private Set<Sailboat> boats;
    private Set<Course> courses;
    private Set<Series> series;

    public Club () { }

    public Club(Integer clubId, String club, String clubEmail, String handicapper, String handicapperEmail, String handicapperPhone, Integer denominator, String type, Set<Sailboat> boats, Set<Course> courses, Set<Series> series) {
        this.clubId = clubId;
        this.club = club;
        this.clubEmail = clubEmail;
        this.handicapper = handicapper;
        this.handicapperEmail = handicapperEmail;
        this.handicapperPhone = handicapperPhone;
        this.denominator = denominator;
        this.type = type;
        this.boats = boats;
        this.courses = courses;
        this.series = series;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClubEmail() {
        return clubEmail;
    }

    public void setClubEmail(String clubEmail) {
        this.clubEmail = clubEmail;
    }

    public String getHandicapper() {
        return handicapper;
    }

    public void setHandicapper(String handicapper) {
        this.handicapper = handicapper;
    }

    public String getHandicapperEmail() {
        return handicapperEmail;
    }

    public void setHandicapperEmail(String handicapperEmail) {
        this.handicapperEmail = handicapperEmail;
    }

    public String getHandicapperPhone() {
        return handicapperPhone;
    }

    public void setHandicapperPhone(String handicapperPhone) {
        this.handicapperPhone = handicapperPhone;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Sailboat> getBoats() {
        return boats;
    }

    public void setBoats(Set<Sailboat> boats) {
        this.boats = boats;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<Series> getSeries() {
        return series;
    }

    public void setSeries(Set<Series> series) {
        this.series = series;
    }
}
