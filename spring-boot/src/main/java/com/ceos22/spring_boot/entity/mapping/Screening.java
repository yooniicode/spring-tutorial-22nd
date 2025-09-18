package com.ceos22.spring_boot.entity.mapping;

import com.ceos22.spring_boot.common.BaseEntity;
import com.ceos22.spring_boot.entity.Genre;
import com.ceos22.spring_boot.entity.Movie;
import com.ceos22.spring_boot.entity.Screen;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Screening extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="screening_id")
    public Long screeningId;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen_id", nullable = false)
    private Screen screen;
}