package com.tech.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.model.Task;
import com.tech.repo.TaskRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getTaskByStatus(String status) {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> getTaskByPriority(String priority) {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> getTaskByDueDateBefore(LocalDate dueDate) {
        return taskRepository.findAll();
    }
    
	
}
