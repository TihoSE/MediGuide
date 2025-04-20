package model;

public class Operatie extends SoortBehandeling {

    public Operatie (String behandelingId, String naam, String beschrijving, String type) {
        super(behandelingId, naam, beschrijving, type);
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
//