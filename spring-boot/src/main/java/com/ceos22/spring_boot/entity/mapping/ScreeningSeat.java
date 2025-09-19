package com.ceos22.spring_boot.entity.mapping;


import com.ceos22.spring_boot.common.BaseEntity;
import com.ceos22.spring_boot.entity.Seat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="screening_seat")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class ScreeningSeat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="screening_seat_id")
    private Long ss_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Screening screening;

    @ManyToOne(fetch = FetchType.LAZY)
    private Seat seat;

    private Integer price;
}
