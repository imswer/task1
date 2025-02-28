package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(String id, Task taskDetails) {
        return taskRepository.findById(id).map(task -> {
            task.setName(taskDetails.getName());
            task.setOwner(taskDetails.getOwner());
            task.setCommand(taskDetails.getCommand());
            return taskRepository.save(task);
        }).orElse(null);
    }

    public boolean deleteTask(String id) {
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String executeTask(String id) {
        return taskRepository.findById(id).map(task -> {
            return "Executing: " + task.getCommand();
        }).orElse("Task not found");
    }
}
