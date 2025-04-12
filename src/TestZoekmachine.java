import model.*;
import java.util.*;

public class TestZoekmachine {
    public static void main(String[] args) {
        // 1. Maak een ziekte aan
        Ziekte griep = new Ziekte("Z1", "Griep", "Virale infectie", Ernst.Matig, "griep.jpg");
        griep.voegSymptoomToe(new Symptoom("S1", "koorts", "Hoge temperatuur", "Z1"));
        griep.voegSymptoomToe(new Symptoom("S2", "vermoeidheid", "Lage energie", "Z1"));

        // 2. Voeg deze toe aan een lijst
        List<Ziekte> database = new ArrayList<>();
        database.add(griep);

        // 3. Maak een zoekmachine aan met die lijst
        Zoekmachine zoekmachine = new Zoekmachine(database);

        // 4. Zoek op symptomen
        List<String> invoer = Arrays.asList("koorts", "hoofdpijn"); // hoofdpijn bestaat niet → irrelevant
        List<Ziekte> gevonden = zoekmachine.zoekZiekteOpSymptomen(invoer);

        // 5. Assertions
        assert !gevonden.isEmpty() : "❌ Geen ziekten gevonden!";
        assert gevonden.get(0).getNaam().equals("Griep") : "❌ Verkeerde ziekte gevonden!";

        System.out.println("✅ TestZoekmachine geslaagd.");
    }
}
