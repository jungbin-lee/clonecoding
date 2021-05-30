package com.sparta.clonecoding.repository;


import com.sparta.clonecoding.models.Drama;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DramaRepository extends JpaRepository<Drama, Long> {

    List<Drama> findAllByOrderByAverageDesc();

    List<Drama> findByContentId(Long contentId);
}
