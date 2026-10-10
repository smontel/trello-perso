package com.taskmanager.repository;

import com.taskmanager.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByTaskColumnIdOrderByPosition(Long columnTaskId);
}