package com.example;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
  
public interface CompletedDateRepository extends CrudRepository<CompletedDate, Long>{
    List<CompletedDate> findByDate(Date date);
}