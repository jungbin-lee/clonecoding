package com.sparta.clonecoding.models;

import com.sparta.clonecoding.dto.ContentDto;
import com.sparta.clonecoding.dto.DramaDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Drama {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column
    private Long contentId;
    @Column
    private String name;
    @Column(length = 1000, nullable = false)
    private String overview;
    @Column
    private String poster_path;
    @Column
    private String firstDate;
    @Column
    private Double average;
    @Column
    private String backdrop_path;
    @Column
    private Long genre;

    public Drama(DramaDto DramaDto) {
        this.contentId = DramaDto.getContentId();
        this.name = DramaDto.getName();
        this.overview = DramaDto.getOverview();
        this.poster_path = DramaDto.getPoster_path();
        this.firstDate = DramaDto.getFirstDate();
        this.average = DramaDto.getAverage();
        this.backdrop_path = DramaDto.getBackdrop_path();
        this.genre = DramaDto.getGenre().get(0);

    }
}
