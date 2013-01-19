package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Entity the Specialty
 * @author Alex.Barchuk
 * Date: 10/7/12
 */

@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="specialty_PK", length = 6)
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_PK")
    private Faculty faculty;

    public long getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
