package com.springboot.main.jira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.jira.model.WorkLog;

public interface WorkLogRepository extends JpaRepository<WorkLog, Integer>{

	List<WorkLog> findByEmployeeId(int eid);

}
