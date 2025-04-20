package model;

import java.util.ArrayList;
import java.util.List;

public class Ziekte {
    private String ziekteId;
    private String naam;
    private String beschrijving;
    private Ernst ernst;
    private String visueelHulpmiddel;

    private List<Symptoom> symptomen = new ArrayList<>();
    private List<SoortBehandeling> behandelingen = new ArrayList<>();
    private List<Preventietip> preventietips = new ArrayList<>();

    public Ziekte(String ziekteId, String naam, String beschrijving, Ernst ernst, String visueelHulpmiddel) {
        this.ziekteId = ziekteId;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.ernst = ernst;
        this.visueelHulpmiddel = visueelHulpmiddel;
    }

    public void voegSymptoomToe(Symptoom s) {
        symptomen.add(s);
    }

    public void voegBehandelingToe(SoortBehandeling b) {
        behandelingen.add(b);
    }

    public void voegPreventietipToe(Preventietip p) {
        preventietips.add(p);
    }

    public String getSamenvatting() {
        return naam + " (" + ernst + "): " + beschrijving;
    }

    public List<Symptoom> getSymptomen() {
        return symptomen;
    }

    public List<SoortBehandeling> getBehandelingen() {
        return behandelingen;
    }

    public String getNaam() {
        return naam;
    }

    public List<Preventietip> getPreventietips() {
        return preventietips;
    }

}
//