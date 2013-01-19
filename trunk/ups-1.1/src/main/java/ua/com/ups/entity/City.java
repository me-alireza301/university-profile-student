package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Entity the City
 * @author Alex.Barchuk
 * Date: 10/3/12
 */

@Entity
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="city_PK", length = 6)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="country_PK", nullable = false)
    private Country country;

    public City() {
    }

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
