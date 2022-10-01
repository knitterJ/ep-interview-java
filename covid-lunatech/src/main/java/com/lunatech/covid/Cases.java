package com.lunatech.covid;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="cases", schema = "public")
public class Cases {
    @Id
    private LocalDate recorded_date;
    private Integer infections;
    private Integer deaths;
    private String iso_country;

    public Cases() {
    }

    public Cases(LocalDate recorded_date, Integer infections, Integer deaths, String iso_country) {
        this.recorded_date = recorded_date;
        this.infections = infections;
        this.deaths = deaths;
        this.iso_country = iso_country;
    }

    public LocalDate getRecorded_date() {
        return recorded_date;
    }

    public void setRecorded_date(LocalDate recorded_date) {
        this.recorded_date = recorded_date;
    }

    public Integer getInfections() {
        return infections;
    }

    public void setInfections(Integer infections) {
        this.infections = infections;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    @Override
    public String toString() {
        return "Cases{" +
//                "id=" + id +
                ", recorded_date='" + recorded_date + '\'' +
                ", infections='" + infections + '\'' +
                ", deaths='" + deaths + '\'' +
                ", iso_country='" + iso_country + '\'' +
                '}';
    }
}
