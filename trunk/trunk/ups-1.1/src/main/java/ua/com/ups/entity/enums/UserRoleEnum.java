package ua.com.ups.entity.enums;

/**
 * TODO - Roles (value) should coincide with roles in the file 'login-security.xml'
 * <intercept-url pattern="/home.html*" access="ROLE_STUDENT, ROLE_TEACHER" />
 *
 * @author Alex.Barchuk
 * Date: 10/27/12
 */

public enum UserRoleEnum {

    ANONYMOUS(0, "ROLE_ANONYMOUS"),
    STUDENT(1, "ROLE_STUDENT"),
    TEACHER(2, "ROLE_TEACHER");

    private String value;
    private int id;

    UserRoleEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public String value() {
        return value;
    }

    public int id() {
        return id;
    }
}
