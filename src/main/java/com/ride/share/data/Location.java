package com.ride.share.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by gnaik on 18/04/17.
 */
@Getter
@Setter
@ToString
@Document(collection="locationDetails")
public class Location {

    @Id
    private String id;
    private String name;
    private String pincode;
}


