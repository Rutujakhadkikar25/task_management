package com.tech.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
