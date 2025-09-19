package com.ceos22.spring_boot.entity;

import com.ceos22.spring_boot.common.BaseEntity;
import com.ceos22.spring_boot.common.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name="total_price")
    private Integer totalPrice;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

}







