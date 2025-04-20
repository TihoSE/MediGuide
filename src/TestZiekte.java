import model.*;

public class TestZiekte {
    public static void main(String[] args) {
        Ziekte griep = new Ziekte("Z1", "Griep", "Virale infectie", Ernst.Matig, "griep.jpg");
        Symptoom symptoom = new Symptoom("S1", "koorts", "Hoge temperatuur", "Z1");
        griep.voegSymptoomToe(symptoom);

        assert griep.getSymptomen().size() == 1 : "❌ Symptoom niet toegevoegd!";
        assert griep.getSymptomen().get(0).getNaam().equals("koorts") : "❌ Verkeerd symptoom!";
        System.out.println("✅ TestZiekte geslaagd.");
    }
}
