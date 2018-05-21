package org.seasailing.db.hibernate;

import java.util.Date;
import java.util.Set;

public class Complete {
    private Integer completeId;
    private Date startTime;
    private Integer seriesMultiplier;
    private String options;
    private Integer denominator;
    private String type;
    private Series series;
    private Course course;
    private Set<Result> results;

    public Complete() {}

    public Complete(Integer completeId, Date startTime, Integer seriesMultiplier, String options, Integer denominator, String type, Series series, Course course, Set<Result> results) {
        this.completeId = completeId;
        this.startTime = startTime;
        this.seriesMultiplier = seriesMultiplier;
        this.options = options;
        this.denominator = denominator;
        this.type = type;
        this.series = series;
        this.course = course;
        this.results = results;
    }

    public Integer getCompleteId() {
        return completeId;
    }

    public void setCompleteId(Integer completeId) {
        this.completeId = completeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getSeriesMultiplier() {
        return seriesMultiplier;
    }

    public void setSeriesMultiplier(Integer seriesMultiplier) {
        this.seriesMultiplier = seriesMultiplier;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
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

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Set<Result> getResults() {
        return results;
    }

    public void setResults(Set<Result> results) {
        this.results = results;
    }


}
