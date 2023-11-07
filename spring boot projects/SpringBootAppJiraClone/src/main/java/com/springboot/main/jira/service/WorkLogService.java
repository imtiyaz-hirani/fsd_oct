package com.springboot.main.jira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.jira.model.WorkLog;
import com.springboot.main.jira.repository.WorkLogRepository;

@Service
public class WorkLogService {

	@Autowired
	private WorkLogRepository workLogRepository;
	
	public WorkLog insert(WorkLog workLog) {
		return workLogRepository.save(workLog);
	}

}
