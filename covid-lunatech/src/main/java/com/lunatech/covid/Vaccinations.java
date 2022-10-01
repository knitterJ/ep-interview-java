package com.lunatech.covid;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "vaccinations", schema = "public")
public class Vaccinations {
    @Id
    private LocalDate recorded_date;
    private Integer daily_vaccinations_raw;

    private Integer daily_vaccinations;

    private String  iso_country;

    public Vaccinations() {

    }

    public Vaccinations(LocalDate recorded_date, Integer daily_vaccinations_raw, Integer daily_vaccinations, String iso_country) {
        this.recorded_date = recorded_date;
        this.daily_vaccinations_raw = daily_vaccinations_raw;
        this.daily_vaccinations = daily_vaccinations;
        this.iso_country = iso_country;
    }

    public LocalDate getRecorded_date() {
        return recorded_date;
    }

    public void setRecorded_date(LocalDate recorded_date) {
        this.recorded_date = recorded_date;
    }

    public Integer getDaily_vaccinations_raw() {
        return daily_vaccinations_raw;
    }

    public void setDaily_vaccinations_raw(Integer daily_vaccinations_raw) {
        this.daily_vaccinations_raw = daily_vaccinations_raw;
    }

    public Integer getDaily_vaccinations() {
        return daily_vaccinations;
    }

    public void setDaily_vaccinations(Integer daily_vaccinations) {
        this.daily_vaccinations = daily_vaccinations;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    @Override
    public String toString() {
        return "Vaccinations{" +
                "recorded_date=" + recorded_date +
                ", daily_vaccinations_raw=" + daily_vaccinations_raw +
                ", daily_vaccinations=" + daily_vaccinations +
                ", iso_country='" + iso_country + '\'' +
                '}';
    }

}
