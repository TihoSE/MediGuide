import model.*;
import java.util.*;

public class TestZoekmachine {
    public static void main(String[] args) {
        Ziekte griep = new Ziekte("Z1", "Griep", "Virale infectie", Ernst.Matig, "griep.jpg");
        griep.voegSymptoomToe(new Symptoom("S1", "koorts", "Hoge temperatuur", "Z1"));

        List<Ziekte> lijst = new ArrayList<>();
        lijst.add(griep);

        Zoekmachine zoekmachine = new Zoekmachine(lijst);
        List<String> input = Arrays.asList("koorts");

        List<Ziekte> resultaat = zoekmachine.zoekZiekteOpSymptomen(input);
        assert resultaat.size() == 1 : "❌ Ziekte niet gevonden op symptoom!";
        assert resultaat.get(0).getNaam().equals("Griep") : "❌ Verkeerde ziekte gevonden!";

        System.out.println("✅ TestZoekmachine geslaagd.");
    }
}

//