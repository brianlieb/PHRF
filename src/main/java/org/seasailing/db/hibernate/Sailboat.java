package org.seasailing.db.hibernate;

public class Sailboat {
    private Integer sailboatId;
    private String name;
    private Integer rating;
    private String owner;
    private String email;
    private String phone;
    private String make;
    private Double length;
    private Boolean active;
    private Club club;

    public Sailboat() {}

    public Sailboat(Integer sailboatId, String name, Integer rating, String owner, String email, String phone, String make, Double length, Boolean active, Club club) {
        this.sailboatId = sailboatId;
        this.name = name;
        this.rating = rating;
        this.owner = owner;
        this.email = email;
        this.phone = phone;
        this.make = make;
        this.length = length;
        this.active = active;
        this.club = club;
    }

    public Integer getSailboatId() {
        return sailboatId;
    }

    public void setSailboatId(Integer sailboatId) {
        this.sailboatId = sailboatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
