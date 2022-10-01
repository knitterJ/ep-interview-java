package com.lunatech.covid;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportsController {

    private VaccinationsService vaccinationsService;

    public ReportsController(VaccinationsService vaccinationsService) {
        this.vaccinationsService = vaccinationsService;
    }

    @GetMapping("/reports")
    public String showForm(Model model){
        model.addAttribute("reportLargest", vaccinationsService.find10Largest(PageRequest.of(0,10)));
        model.addAttribute("reportSmallest", vaccinationsService.find10Smallest(PageRequest.of(0,10)));
        model.addAttribute("reportHighestInfections", vaccinationsService.highestInfectionsPerCitizen(PageRequest.of(0,10)));
        return "reports";
    }
}
