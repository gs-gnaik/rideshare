package com.ride.share.repository;

import com.mongodb.WriteResult;
import com.ride.share.data.Location;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */

public interface LocationRepository<T> {

    public List<Location> getAllLocations();

    public void saveLocation(Location location);

    public Location getLocation(String id);

    public WriteResult updateLocation(String id, String name);

    public void deleteLocation(String id);

}
