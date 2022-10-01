package com.lunatech.covid;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationsRepo extends JpaRepository<Vaccinations, Long> {
    @Query(value = "SELECT m.name, SUM(t.daily_vaccinations) FROM Vaccinations t INNER JOIN Countries m ON (t.iso_country = m.code) GROUP BY m.name ORDER BY SUM(t.daily_vaccinations) DESC ")
    Iterable<Vaccinations> find10Largest(PageRequest pageRequest);

    @Query(value = "SELECT m.name, SUM(t.daily_vaccinations) FROM Vaccinations t INNER JOIN Countries m ON (t.iso_country = m.code) GROUP BY m.name ORDER BY SUM(t.daily_vaccinations) ASC ")
    Iterable<Vaccinations> find10Smallest(PageRequest pageRequest);

    @Query(value = "SELECT m.name, SUM(p.infections) * 1.0 / m.population * 100000.0 FROM Countries m INNER JOIN Cases p ON (p.iso_country = m.code) GROUP BY m.name, m.population ORDER BY 2 DESC")
    Iterable<Vaccinations> highestInfectionsPerCitizen(PageRequest pageRequest);

}


