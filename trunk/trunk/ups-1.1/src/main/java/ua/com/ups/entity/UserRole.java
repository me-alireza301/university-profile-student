package ua.com.ups.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User_Role")
@NamedQueries({
        @NamedQuery(name="UserRole.getByName",
                    query="select ur from UserRole ur where ur.authority=:nameRole"),
        @NamedQuery(name="UserRole.getAll",
                    query = "select ur from UserRole ur WHERE ur.authority <> 'ROLE_ANONYMOUS'")
})
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy="increment")
    @Column(name="role_PK", length = 6, nullable = false)
    private long id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "authority", nullable = false, length = 45)
    private String authority;

    @Transient
    private String name;

    public UserRole() {
    }

    public UserRole(String description, String authority) {
        this.description = description;
        this.authority = authority;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
