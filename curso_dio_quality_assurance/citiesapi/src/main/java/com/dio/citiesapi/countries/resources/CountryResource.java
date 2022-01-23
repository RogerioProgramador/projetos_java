package com.dio.citiesapi.countries.resources;

import com.dio.citiesapi.countries.entities.Country;
import com.dio.citiesapi.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }
}