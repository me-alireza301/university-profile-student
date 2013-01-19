package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Entity the University
 * @author Alex.Barchuk
 * Date: 10/3/12
 */

@Entity
@Table(name = "University")
public class University {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="university_PK", length = 6)
    private long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", length = 600)
    private String description;

    @Column(name = "street", nullable = false, length = 255)
    private String street;

    @Column(name = "house_number", nullable = false)
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_PK", nullable = false)
    private City city;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
