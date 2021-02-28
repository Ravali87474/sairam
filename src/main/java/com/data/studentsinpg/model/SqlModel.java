package com.data.studentsinpg.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="courseinfo")
@Setter
@Getter
public class SqlModel {
    private String name;
    private int age;
    private String course;
    private double fee;
    @Id
    private int studentId;
    private String Organization;
}
