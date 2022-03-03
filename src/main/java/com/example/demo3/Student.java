package com.example.demo3;

public class Student {
    private String naam, voornaam, studierichting;
    private int leeftijd;

    public Student(String naam, String voornaam, String studierichting, int leeftijd) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.studierichting = studierichting;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getStudierichting() {
        return studierichting;
    }

    public void setStudierichting(String studierichting) {
        this.studierichting = studierichting;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
