package com.ride.share.service;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
public interface RideShareService<T> {
    List<T> findAll();

    T find(String id);

    void delete(String id);

    T save(T object);

    T update(T object);
}
