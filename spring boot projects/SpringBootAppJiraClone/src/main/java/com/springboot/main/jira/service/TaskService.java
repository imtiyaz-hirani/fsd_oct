package com.springboot.main.jira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.jira.model.Task;
import com.springboot.main.jira.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	public Task insert(Task task) {
		return taskRepository.save(task);
	}

}
