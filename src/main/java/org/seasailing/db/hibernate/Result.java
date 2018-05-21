package org.seasailing.db.hibernate;

public class Result {
    private Integer result_id;
    private String boatName;
    private Integer rating;
    private Integer elapsedTime;
    private Integer correctedTime;
    private Integer place;
    private String status;
    private Complete complete;

    public Result() {}

    public Result(Integer result_id, String boatName, Integer rating, Integer elapsedTime, Integer correctedTime, Integer place, String status, Complete complete) {
        this.result_id = result_id;
        this.boatName = boatName;
        this.rating = rating;
        this.elapsedTime = elapsedTime;
        this.correctedTime = correctedTime;
        this.place = place;
        this.status = status;
        this.complete = complete;
    }

    public Integer getResult_id() {
        return result_id;
    }

    public void setResult_id(Integer result_id) {
        this.result_id = result_id;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getCorrectedTime() {
        return correctedTime;
    }

    public void setCorrectedTime(Integer correctedTime) {
        this.correctedTime = correctedTime;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Complete getComplete() {
        return complete;
    }

    public void setComplete(Complete complete) {
        this.complete = complete;
    }
}
