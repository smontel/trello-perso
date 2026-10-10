package com.taskmanager.repository;

import com.taskmanager.entity.TaskColumn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskColumnRepository extends JpaRepository<TaskColumn, Long> {

    List<TaskColumn>findTByBoardIdOrderByPosition(Long boardId);
}