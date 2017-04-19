package com.ride.share.repository;

import com.mongodb.WriteResult;
import com.ride.share.data.Location;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by gnaik on 18/04/17.
 */
public class LocationRepositoryImpl implements LocationRepository {

    MongoTemplate mongoTemplate;

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public List<Location> getAllLocations() {
        return mongoTemplate.findAll(Location.class);
    }

    @Override
    public void saveLocation(Location location) {
         mongoTemplate.save(location);
    }

    @Override
    public Location getLocation(String id) {
        return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)),
                Location.class);
    }

    @Override
    public WriteResult updateLocation(String id, String name) {
        return mongoTemplate.updateFirst(
                new Query(Criteria.where("id").is(id)),
                Update.update("name", name), Location.class);
    }

    @Override
    public void deleteLocation(String id) {
        mongoTemplate
                .remove(new Query(Criteria.where("id").is(id)), Location.class);
    }
}
