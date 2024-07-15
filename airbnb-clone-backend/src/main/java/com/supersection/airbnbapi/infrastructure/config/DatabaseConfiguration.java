package com.supersection.airbnbapi.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({
        "com.supersection.airbnbapi.user.repository",
        "com.supersection.airbnbapi.listing.repository",
        "com.supersection.airbnbapi.booking.repository"
})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
