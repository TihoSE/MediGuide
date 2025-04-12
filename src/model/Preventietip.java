package model;

public class Preventietip {
    private String id;
    private String tekst;
    private String ziekteID;

    public Preventietip(String id, String tekst, String ziekteID) {
        this.id = id;
        this.tekst = tekst;
        this.ziekteID = ziekteID;
    }

    public String getTekst() {
        return tekst;
    }
}
