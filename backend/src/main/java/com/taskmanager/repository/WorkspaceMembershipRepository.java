package com.taskmanager.repository;


import com.taskmanager.entity.WorkspaceMembership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WorkspaceMembershipRepository extends JpaRepository<WorkspaceMembership, Long> {

    List<WorkspaceMembership> findByUserId(Long userId);

    Optional<WorkspaceMembership> findByUserIdAndWorkspaceId(Long userId, Long workspaceId);

}