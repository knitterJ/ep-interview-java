package com.lunatech.covid;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class VaccinationsService {

    private VaccinationsRepo vaccinationsRepo;

    public VaccinationsService(VaccinationsRepo vaccinationsRepo) {
        this.vaccinationsRepo = vaccinationsRepo;
    }

    public Iterable<Vaccinations> find10Largest(PageRequest pageRequest){
        return vaccinationsRepo.find10Largest(pageRequest);
    }

    public Iterable<Vaccinations> find10Smallest(PageRequest pageRequest){
        return vaccinationsRepo.find10Smallest(pageRequest);
    }

    public Iterable<Vaccinations> highestInfectionsPerCitizen(PageRequest pageRequest){
        return vaccinationsRepo.highestInfectionsPerCitizen(pageRequest);
    }
}
