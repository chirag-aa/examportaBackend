package com.examPortal1.examPortal1.repo;

import com.examPortal1.examPortal1.Entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Roles,Long> {
}
