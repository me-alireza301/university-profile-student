package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entity the Country
 * @author Alex.Barchuk
 * Date: 10/3/12
 */

@Entity
@Table(name = "Country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="country_PK", length = 6)
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
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
}
