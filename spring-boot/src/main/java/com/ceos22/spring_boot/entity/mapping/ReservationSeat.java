package com.ceos22.spring_boot.entity.mapping;

import com.ceos22.spring_boot.common.BaseEntity;
import com.ceos22.spring_boot.entity.Reservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class ReservationSeat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reservation_id")
    private Long rs_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.LAZY)
    private ScreeningSeat screeningSeat;

    private Integer price;
}