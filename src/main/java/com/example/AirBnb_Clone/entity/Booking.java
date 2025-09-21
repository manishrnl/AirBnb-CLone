package com.example.AirBnb_Clone.entity;

import com.fasterxml.jackson.databind.util.ArrayBuilders;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Room room;

    @ManyToOne
    private Hotel hotel;

    private Long hotelId;
    private Long roomId;
    private Long userId;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean status;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Long paymentId;


}
