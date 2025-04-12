package model;

public class Symptoom {
    private String symptoomId;
    private String naam;
    private String beschrijving;
    private String ziekteSPId;

    public Symptoom(String symptoomId, String naam, String beschrijving, String ziekteSPId) {
        this.symptoomId = symptoomId;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.ziekteSPId = ziekteSPId;
    }

    public String getNaam() {
        return naam;
    }
}
