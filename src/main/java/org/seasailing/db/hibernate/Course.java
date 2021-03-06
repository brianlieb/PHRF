package org.seasailing.db.hibernate;
// Generated May 26, 2018, 6:35:30 PM by Hibernate Tools 4.3.2-SNAPSHOT


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name="course"
    ,catalog="seas"
)
public class Course  implements java.io.Serializable {


     private Integer courseId;
     private Club club;
     private BigDecimal distance;
     private String description;
     private String name;
     private Set<Complete> completes = new HashSet<Complete>(0);

    public Course() {
    }

	
    public Course(Club club, BigDecimal distance, String description, String name) {
        this.club = club;
        this.distance = distance;
        this.description = description;
        this.name = name;
    }
    public Course(Club club, BigDecimal distance, String description, String name, Set<Complete> completes) {
       this.club = club;
       this.distance = distance;
       this.description = description;
       this.name = name;
       this.completes = completes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="course_id", unique=true, nullable=false)
    public Integer getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="club_id", nullable=false)
    public Club getClub() {
        return this.club;
    }
    
    public void setClub(Club club) {
        this.club = club;
    }

    
    @Column(name="distance", nullable=false, precision=5)
    public BigDecimal getDistance() {
        return this.distance;
    }
    
    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    
    @Column(name="description", nullable=false, length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
    public Set<Complete> getCompletes() {
        return this.completes;
    }
    
    public void setCompletes(Set<Complete> completes) {
        this.completes = completes;
    }




}


