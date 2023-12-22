package com.examPortal1.examPortal1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.examPortal1.examPortal1.Entity.User;
@Repository
public interface userRepo extends JpaRepository<User,Long> {

    User findByuserName(String userName);
}
