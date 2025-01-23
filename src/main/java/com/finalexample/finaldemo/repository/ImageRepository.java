package com.finalexample.finaldemo.repository;

import com.finalexample.finaldemo.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}