package com.ceos22.spring_boot.entity;

import com.ceos22.spring_boot.common.BaseEntity;
import com.ceos22.spring_boot.common.enums.Rating;
import com.ceos22.spring_boot.entity.mapping.Categorizing;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Movie extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String title;

    private String language;

    @Column(name = "poster_url")
    private String posterUrl;

    @Column(name="running_time")
    private Integer runningTime;

    @Column(name="release_date")
    private Date releaseDate;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    @Column(name="is_active")
    private boolean isActive;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private List<String> directors;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private List<String> actors;

    @OneToMany(mappedBy = "movie")
    private List<Categorizing> categorizings = new ArrayList<>();
}
