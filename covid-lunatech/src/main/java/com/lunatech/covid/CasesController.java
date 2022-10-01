package com.lunatech.covid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/country")
public class CasesController {
    private CasesService casesService;

    private CasesRepo casesRepo;

    @Autowired
    public CasesController(CasesRepo casesRepo, CasesService casesService) {
        this.casesRepo = casesRepo;
        this.casesService = casesService;
    }

    @GetMapping("bydate")
    Iterable<Cases> searchDailyInfectionsByDateCountry(@RequestParam("date") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate recorded_date, @RequestParam("country") String name) {
        return casesService.searchDailyInfectionsByDateCountry(recorded_date, name);
    }
}
