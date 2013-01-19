package ua.com.ups.dao;

import java.util.List;

/**
 * This default for all dao
 * Date: 10/4/12
 * @author Alex.Barchuk
 */
public interface DefaultDAO<T> {

    /**
     * Save entity from database.
     *
     * @param t - the entity
     * @return - the entity
     */
    public T save(T t);

    /**
     * Update entity from database.
     *
     * @param t - the entity
     * @return - the entity
     */
    public boolean update(T t);

    /**
     * Gets entity from database.
     *
     * @param id - the entity by id
     * @return - T entity
     */
    public T getById(long id);

    /**
     * Delete the entity.
     *
     * @param t - the etity
     */
    public void delete(T t);

    /**
     * Gets list T by entity.
     *
     * @return - list T
     */
    public List<T> getAll();

}
