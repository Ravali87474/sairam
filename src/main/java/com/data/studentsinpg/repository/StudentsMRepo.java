package com.data.studentsinpg.repository;

import com.data.studentsinpg.model.MongodbModel;
import com.data.studentsinpg.model.SqlModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface StudentsMRepo extends MongoRepository<MongodbModel, Id> {
}

