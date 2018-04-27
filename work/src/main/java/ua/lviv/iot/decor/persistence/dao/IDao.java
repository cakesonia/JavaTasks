package ua.lviv.iot.decor.persistence.dao;

public interface IDao<T> {

    T findById(Integer id);

    T persist(T object);

    void delete(Integer id);

    T update(T object);
}
