package com.taskmanager.repository;

import com.taskmanager.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findBoardByWorkspace(Long WorkspaceId);
}