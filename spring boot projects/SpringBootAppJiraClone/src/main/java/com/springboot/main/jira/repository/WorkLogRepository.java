package com.springboot.main.jira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.jira.model.WorkLog;

public interface WorkLogRepository extends JpaRepository<WorkLog, Integer>{

}
