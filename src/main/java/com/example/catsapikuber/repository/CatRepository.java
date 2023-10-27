package com.example.catsapikuber.repository;

import com.example.catsapikuber.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {
}
