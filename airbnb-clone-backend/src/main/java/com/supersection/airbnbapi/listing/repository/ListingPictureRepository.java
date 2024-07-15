package com.supersection.airbnbapi.listing.repository;

import com.supersection.airbnbapi.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
