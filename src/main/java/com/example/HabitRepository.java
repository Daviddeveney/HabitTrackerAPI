package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 
 
public interface HabitRepository extends CrudRepository<Habit, Long>{
    
}