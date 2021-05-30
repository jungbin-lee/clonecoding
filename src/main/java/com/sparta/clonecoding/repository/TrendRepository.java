package com.sparta.clonecoding.repository;


import com.sparta.clonecoding.models.Trend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrendRepository extends JpaRepository<Trend, Long> {

    List<Trend> findAllByOrderByAverageDesc();

    List<Trend> findByContentId(Long contentId);
}
