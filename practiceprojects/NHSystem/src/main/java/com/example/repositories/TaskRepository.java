package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Task;

public interface TaskRepository  extends JpaRepository<Task,Long>{

}
