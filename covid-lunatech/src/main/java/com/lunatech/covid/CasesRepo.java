package com.lunatech.covid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CasesRepo extends JpaRepository<Cases, Long> {

    @Query("SELECT  t, m.name  FROM Cases t INNER JOIN Countries m ON (t.iso_country = m.code) WHERE m.name like %:country% AND t.recorded_date <= :date order by t.recorded_date desc")
    Iterable<Cases> searchDailyInfectionsByDateCountry(@Param("date")LocalDate recorded_date, @Param("country") String name);

}

