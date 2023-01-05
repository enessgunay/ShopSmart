package com.shop.models;

import com.shop.models.data.Admin;
import com.shop.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByUsername(String username);
}
