package ua.com.ups.service;

import ua.com.ups.entity.User;
import ua.com.ups.entity.UserRole;

/**
 * Lets work from user.
 *
 * @author Alex.Barchuk
 */
public interface UserService{

    /**
     * Add new user.
     *
     * @param user - new user
     * @return - saved user
     */
    public User add(User user);

    /**
     * Find user by id.
     *
     * @param id - user id
     * @return - user by id
     */
    public User find(long id);

    /**
     * Changes the user and save.
     *
     * @param user
     * @return changed user
     */
    public User edit(User user);

    /**
     * Gets UserRole by name.
     * @param name - role name
     * @return - UserRole by name
     */
    public UserRole getRole(String name);

    /**
     * This method gets User by email.
     *
     * @param email - email
     * @return - gets User by email
     */
    public User getUserByEmail(String email);

}
