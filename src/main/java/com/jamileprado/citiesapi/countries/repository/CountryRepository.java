package com.jamileprado.citiesapi.countries.repository;

import com.jamileprado.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
