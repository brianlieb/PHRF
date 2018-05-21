package org.seasailing.db.hibernate;

import java.util.Set;

public class Series {
    private Integer seriesId;
    private String name;
    private String sponsor;
    private String description;
    private Integer seasonMultiplier;
    private Club club;
    private Set<Complete> completed;

    public Series() {}

    public Series(Integer seriesId, String name, String sponsor, String description, Integer seasonMultiplier, Club club, Set<Complete> completed) {
        this.seriesId = seriesId;
        this.name = name;
        this.sponsor = sponsor;
        this.description = description;
        this.seasonMultiplier = seasonMultiplier;
        this.club = club;
        this.completed = completed;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSeasonMultiplier() {
        return seasonMultiplier;
    }

    public void setSeasonMultiplier(Integer seasonMultiplier) {
        this.seasonMultiplier = seasonMultiplier;
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
