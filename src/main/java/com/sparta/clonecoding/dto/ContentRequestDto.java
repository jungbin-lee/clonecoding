package com.sparta.clonecoding.dto;

import lombok.Getter;

@Getter
public class ContentRequestDto {
    private String title;

    private String overview;

    private String poster_path;

    private String releaseDate;

    private Double average;

    private String backdrop_path;

    private int genre;
}
