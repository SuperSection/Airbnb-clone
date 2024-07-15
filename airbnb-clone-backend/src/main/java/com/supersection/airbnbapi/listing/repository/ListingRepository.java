package com.supersection.airbnbapi.listing.repository;

import com.supersection.airbnbapi.listing.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
