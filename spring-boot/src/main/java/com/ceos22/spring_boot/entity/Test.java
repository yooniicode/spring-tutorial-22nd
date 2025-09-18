package com.ceos22.spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data; // 미사용
import lombok.Getter;

@Getter
@Entity
public class Test {

    @Id
    private Long id;
    private String name;
}