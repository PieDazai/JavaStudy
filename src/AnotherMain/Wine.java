package AnotherMain;

import java.time.LocalDate;
import java.time.Period;

public class Wine {

   private String nameWine, marka, countryMake, opisanie;
   private LocalDate dateWine;

    public Wine() {}

    public Wine(String nameWine, String marka, String countryMake, String opisanie, LocalDate dateWine) {
        this.nameWine = nameWine;
        this.marka = marka;
        this.countryMake = countryMake;
        this.opisanie = opisanie;
        this.dateWine = dateWine;
    }

    public String getNameWine() {
        return nameWine;
    }

    public void setNameWine(String nameWine) {
        this.nameWine = nameWine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCountryMake() {
        return countryMake;
    }

    public void setCountryMake(String countryMake) {
        this.countryMake = countryMake;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public LocalDate getDateWine() {
        return dateWine;
    }

    public void setDateWine(LocalDate dateWine) {
        this.dateWine = dateWine;
    }

    public void YearWine(LocalDate now) {
        int years = Period.between(dateWine, now).getYears();
        System.out.println("Выдержка " +years +" лет");
    }

}
