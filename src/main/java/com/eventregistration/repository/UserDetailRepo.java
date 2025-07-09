package com.eventregistration.repository;

import com.eventregistration.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<UserDetails,Long> {
    boolean existsById(Long id);

}
