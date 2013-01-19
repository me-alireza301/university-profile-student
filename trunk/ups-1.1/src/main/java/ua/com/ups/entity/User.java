package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Entity the User
 * @author Alex.Barchuk
 * Date: 9/27/12
 */

@Entity
@Table(name = "User")
@NamedQueries({
        @NamedQuery(name = "User.findAllUsers", query = "select u from User u"),
        @NamedQuery(name = "User.getUserByEmail", query = "select u from User u where u.email=:email")
})
public class User implements Serializable {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="user_PK", length = 6)
    private long id;

    @Column(name = "email", length = 64, nullable = false)
    private String email;

    @Column(name = "password", nullable = false, length = 400)
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="role_FK")
    private UserRole userRole;

    @Column(name = "firstname", nullable = false, length = 20)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 20)
    private String lastname;

    @Column(name = "middle_name", length = 20)
    private String middleName;

    @Column(name = "day_birthday")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dayBirthday;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="education_PK")
    private Set<Education> educations;

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDayBirthday() {
        return dayBirthday;
    }

    public void setDayBirthday(Date dayBirthday) {
        this.dayBirthday = dayBirthday;
    }

    public Set<Education> getEducations() {
        return educations;
    }

    public void setEducations(Set<Education> educations) {
        this.educations = educations;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
