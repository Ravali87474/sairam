package com.data.studentsinpg.repository;

import com.data.studentsinpg.model.SqlModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface StudentsSRepo extends JpaRepository<SqlModel, Id> {
}

