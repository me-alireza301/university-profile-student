package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity the Education
 * @author Alex.Barchuk
 * Date: 10/7/12
 */

@Entity
@Table(name = "Education")
public class Education implements Serializable {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="education_PK", length = 6)
    private long id;

    @Column(name = "year_admission")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date yearAdmission;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="university_PK", nullable=false)
    private University university;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_PK", nullable=false)
    private Faculty faculties;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="specialty_PK", nullable=false)
    private Specialty specialties;

    public long getId() {
        return id;
    }

    public Date getYearAdmission() {
        return yearAdmission;
    }

    public void setYearAdmission(Date yearAdmission) {
        this.yearAdmission = yearAdmission;
    }

    public University getUniversities() {
        return university;
    }

    public void setUniversities(University university) {
        this.university = university;
    }

    public Faculty getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty faculties) {
        this.faculties = faculties;
    }

    public Specialty getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Specialty specialties) {
        this.specialties = specialties;
    }
}
