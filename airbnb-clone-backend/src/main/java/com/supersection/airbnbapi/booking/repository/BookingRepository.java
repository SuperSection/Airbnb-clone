package com.supersection.airbnbapi.booking.repository;

import com.supersection.airbnbapi.booking.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
