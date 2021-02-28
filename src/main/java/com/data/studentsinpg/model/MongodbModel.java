package com.data.studentsinpg.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
@Document
@Setter
@Getter
public class MongodbModel {
    private String name;
    private int age;
    private String course;
    private double fee;
    @Id
    private int studentId;
    private String Organization;
}
