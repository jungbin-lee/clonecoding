package com.sparta.clonecoding.repository;


import com.sparta.clonecoding.models.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Content, Long> {

    List<Content> findAllByOrderByAverageDesc();

    List<Content> findByContentId(Long contentId);

}