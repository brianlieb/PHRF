package org.seasailing.db.hibernate;
// Generated May 26, 2018, 6:35:30 PM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Result generated by hbm2java
 */
@Entity
@Table(name="result"
    ,catalog="seas"
)
public class Result  implements java.io.Serializable {


     private Integer resultId;
     private Complete complete;
     private String boatname;
     private Integer rating;
     private Integer elapsedTime;
     private Integer correctedTime;
     private String place;
     private String status;
     private Date finishTime;

    public Result() {
    }

	
    public Result(Complete complete, String boatname, Integer rating, Integer elapsedTime, Integer correctedTime, String place) {
        this.complete = complete;
        this.boatname = boatname;
        this.rating = rating;
        this.elapsedTime = elapsedTime;
        this.correctedTime = correctedTime;
        this.place = place;
    }
    public Result(Complete complete, String boatname, Integer rating, Integer elapsedTime, Integer correctedTime, String place, String status, Date finishTime) {
       this.complete = complete;
       this.boatname = boatname;
       this.rating = rating;
       this.elapsedTime = elapsedTime;
       this.correctedTime = correctedTime;
       this.place = place;
       this.status = status;
       this.finishTime = finishTime;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="result_id", unique=true, nullable=false)
    public Integer getResultId() {
        return this.resultId;
    }
    
    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="complete_id", nullable=false)
    public Complete getComplete() {
        return this.complete;
    }
    
    public void setComplete(Complete complete) {
        this.complete = complete;
    }

    
    @Column(name="boatname", nullable=false, length=25)
    public String getBoatname() {
        return this.boatname;
    }
    
    public void setBoatname(String boatname) {
        this.boatname = boatname;
    }

    
    @Column(name="rating", nullable=false)
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    
    @Column(name="elapsed_time", nullable=false)
    public Integer getElapsedTime() {
        return this.elapsedTime;
    }
    
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    
    @Column(name="corrected_time", nullable=false)
    public Integer getCorrectedTime() {
        return this.correctedTime;
    }
    
    public void setCorrectedTime(Integer correctedTime) {
        this.correctedTime = correctedTime;
    }

    
    @Column(name="place", nullable=false, length=3)
    public String getPlace() {
        return this.place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }

    
    @Column(name="status", length=8)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="finish_time", length=26)
    public Date getFinishTime() {
        return this.finishTime;
    }
    
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }




}

