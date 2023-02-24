package com.lunatech.covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CasesService {

    private CasesRepo casesRepo;

    public CasesService(CasesRepo casesRepo){
        this.casesRepo = casesRepo;
    }

    public Iterable<Cases> searchDailyInfectionsByDateCountry( LocalDate recorded_date, String name) {
        return casesRepo.searchDailyInfectionsByDateCountry(recorded_date, name);
    }
}
