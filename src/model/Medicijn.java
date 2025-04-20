package model;

public class Medicijn extends SoortBehandeling {

    public Medicijn(String MedicijnBehandelingId, String naam, String beschrijving, String type) {
        super(MedicijnBehandelingId, naam, beschrijving, type);
    }

    @Override
    public String getDetails() {
        switch (type.toLowerCase()) {
            case "medicatie":
                return naam + " is een medicijn. Info: " + beschrijving;
            case "leefstijl":
                return naam + " is een leefstijladvies. Tip: " + beschrijving;
            default:
                return naam + " (" + type + "): " + beschrijving;
        }
    }
}
