package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tech.model.Task;
import com.tech.service.TaskServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	private TaskServiceImpl taskService;


	@PostMapping
	public ResponseEntity<Task> createTask(@RequestBody Task task) {

		Task saveTask = taskService.saveTask(task);
		return new ResponseEntity<Task>(saveTask, HttpStatus.CREATED);
	}

	

	@GetMapping("/{id}")
	public Optional<Task> getTaskById(@PathVariable Long id) {
		return taskService.getTaskById(id);
	}

	@GetMapping("/hello")
    public String getHello() {
		return "hello";
	}

	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}



	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}
	
	
}
