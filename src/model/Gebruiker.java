package model;

public class Gebruiker {
    private String gebruikersID;
    private String naam;
    private String taalvoorkeur;

    public Gebruiker(String gebruikersID, String naam, String taalvoorkeur) {
        this.gebruikersID = gebruikersID;
        this.naam = naam;
        this.taalvoorkeur = taalvoorkeur;
    }
}
