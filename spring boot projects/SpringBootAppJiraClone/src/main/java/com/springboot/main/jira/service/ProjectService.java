package com.springboot.main.jira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.jira.model.Project;
import com.springboot.main.jira.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project insert(Project project) {

		return projectRepository.save(project);
	}

}
