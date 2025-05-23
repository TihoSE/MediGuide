package model;

public abstract class SoortBehandeling {
    protected String behandelingId;
    protected String naam;
    protected String beschrijving;
    protected String type;

    public SoortBehandeling(String behandelingId, String naam, String beschrijving, String type) {
        this.behandelingId = behandelingId;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.type = type;
    }

    public abstract String getDetails();

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }
}
//