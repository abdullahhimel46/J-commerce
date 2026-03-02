package com.rezaur.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class CartRepository extends JpaRepository<User,UUID> {
    // user class needed
}
