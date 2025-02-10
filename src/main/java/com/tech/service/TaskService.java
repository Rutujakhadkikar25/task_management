package com.tech.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.tech.model.Task;

public interface TaskService  {
	Task saveTask(Task task);
	Optional<Task> getTaskById(Long id);
	List<Task> getAllTasks();
	void deleteTask(Long id);
	List<Task> getTaskByStatus(String status);
	List<Task> getTaskByPriority(String priority);
	List<Task> getTaskByDueDateBefore(LocalDate dueDate);
	
}
