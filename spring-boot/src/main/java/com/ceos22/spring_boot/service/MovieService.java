package com.ceos22.spring_boot.service;

import com.ceos22.spring_boot.dto.MovieDto;
import com.ceos22.spring_boot.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Page<MovieDto> getAllMovies(Pageable pageable) {
        return movieRepository.findAll(pageable)
                .map(MovieDto::fromEntity);
    }

    public MovieDto getMovieById(Long id) {
        return movieRepository.findById(id)
                .map(MovieDto::fromEntity)
                .orElse(null);
    }
}
