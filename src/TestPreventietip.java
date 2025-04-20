import model.*;

public class TestPreventietip {
    public static void main(String[] args) {
        Ziekte z = new Ziekte("Z1", "Griep", "Virus", Ernst.Matig, "griep.jpg");
        Preventietip tip = new Preventietip("P1", "Was je handen", "Z1");

        z.voegPreventietipToe(tip);

        assert z.getPreventietips().size() == 1 : "❌ Preventietip niet toegevoegd!";
        assert z.getPreventietips().get(0).getTekst().equals("Was je handen") : "❌ Verkeerde preventietip!";
        System.out.println("✅ TestPreventietip geslaagd.");
    }
}

