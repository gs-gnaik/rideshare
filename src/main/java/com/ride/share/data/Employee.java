package com.ride.share.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by gnaik on 18/04/17.
 */
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Document(collection="employeeDetails")
public class Employee {

    @Id
    private String id;
    private String name;
    private String emailAddress;
    private String location;
    private String contactNo;

}
