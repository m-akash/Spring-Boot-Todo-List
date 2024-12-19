package com.akash.toDo.To_Do_application.repository;

import com.akash.toDo.To_Do_application.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
