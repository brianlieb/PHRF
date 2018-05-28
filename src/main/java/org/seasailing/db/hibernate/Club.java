package org.seasailing.db.hibernate;
// Generated May 26, 2018, 6:35:30 PM by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Club generated by hbm2java
 */
@Entity
@Table(name="club"
    ,catalog="seas"
)
public class Club  implements java.io.Serializable {


     private Integer clubId;
     private String club;
     private String clubEmail;
     private String handicapper;
     private String handicapperEmail;
     private String handicapperPhone;
     private Integer denominator;
     private String type;
     private Set<Course> courses = new HashSet<Course>(0);
     private Set<Sailboat> sailboats = new HashSet<Sailboat>(0);
     private Set<Series> serieses = new HashSet<Series>(0);

    public Club() {
    }

	
    public Club(String club) {
        this.club = club;
    }
    public Club(String club, String clubEmail, String handicapper, String handicapperEmail, String handicapperPhone, Integer denominator, String type, Set<Course> courses, Set<Sailboat> sailboats, Set<Series> serieses) {
       this.club = club;
       this.clubEmail = clubEmail;
       this.handicapper = handicapper;
       this.handicapperEmail = handicapperEmail;
       this.handicapperPhone = handicapperPhone;
       this.denominator = denominator;
       this.type = type;
       this.courses = courses;
       this.sailboats = sailboats;
       this.serieses = serieses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="club_id", unique=true, nullable=false)
    public Integer getClubId() {
        return this.clubId;
    }
    
    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    
    @Column(name="club", nullable=false, length=45)
    public String getClub() {
        return this.club;
    }
    
    public void setClub(String club) {
        this.club = club;
    }

    
    @Column(name="club_email", length=100)
    public String getClubEmail() {
        return this.clubEmail;
    }
    
    public void setClubEmail(String clubEmail) {
        this.clubEmail = clubEmail;
    }

    
    @Column(name="handicapper", length=100)
    public String getHandicapper() {
        return this.handicapper;
    }
    
    public void setHandicapper(String handicapper) {
        this.handicapper = handicapper;
    }

    
    @Column(name="handicapper_email", length=100)
    public String getHandicapperEmail() {
        return this.handicapperEmail;
    }
    
    public void setHandicapperEmail(String handicapperEmail) {
        this.handicapperEmail = handicapperEmail;
    }

    
    @Column(name="handicapper_phone", length=100)
    public String getHandicapperPhone() {
        return this.handicapperPhone;
    }
    
    public void setHandicapperPhone(String handicapperPhone) {
        this.handicapperPhone = handicapperPhone;
    }

    
    @Column(name="denominator")
    public Integer getDenominator() {
        return this.denominator;
    }
    
    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    
    @Column(name="type", length=45)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="club")
    public Set<Course> getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="club")
    public Set<Sailboat> getSailboats() {
        return this.sailboats;
    }
    
    public void setSailboats(Set<Sailboat> sailboats) {
        this.sailboats = sailboats;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="club")
    public Set<Series> getSerieses() {
        return this.serieses;
    }
    
    public void setSerieses(Set<Series> serieses) {
        this.serieses = serieses;
    }




}


