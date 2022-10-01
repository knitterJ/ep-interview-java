package com.lunatech.covid;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries", schema = "public")
public class Countries {

    @Id
    private Long id;

    private String code;

    private String name;

    private Long population;

    private String continent;

    private String wikipedia_link;

    private String keywords;

    public Countries(){

    }

    public Countries(String code, String name, Long population, String continent, String wikipedia_link, String keywords) {
        this.code = code;
        this.name = name;
        this.population = population;
        this.continent = continent;
        this.wikipedia_link = wikipedia_link;
        this.keywords = keywords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWikipedia_link() {
        return wikipedia_link;
    }

    public void setWikipedia_link(String wikipedia_link) {
        this.wikipedia_link = wikipedia_link;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                ", wikipedia_link='" + wikipedia_link + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }



}
