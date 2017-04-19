package com.ride.share.service;

import com.ride.share.data.Location;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
@Service
public class LocationServiceImpl implements RideShareService<Location> {
    @Override
    public List<Location> findAll() {
        return null;
    }

    @Override
    public Location find(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Location save(Location object) {
        return null;
    }

    @Override
    public Location update(Location object) {
        return null;
    }
}
