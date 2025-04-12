import java.util.*;
import model.*;

public class Main {
    public static void main(String[] args) {

        //vb
        Ziekte griep = new Ziekte("Z1", "Griep", "Virale infectie met koorts", Ernst.Matig, "griep.jpg");

        griep.voegSymptoomToe(new Symptoom("S1", "koorts", "Hoge temperatuur", "Z1"));
        griep.voegSymptoomToe(new Symptoom("S2", "vermoeidheid", "Erg moe", "Z1"));

        griep.voegBehandelingToe(new ConcreteBehandeling("B1", "Rust", "Blijven uitzieken", "leefstijl"));
        griep.voegPreventietipToe(new Preventietip("P1", "Was je handen vaak", "Z1"));

        List<Ziekte> lijst = new ArrayList<>();
        lijst.add(griep);

        Zoekmachine zoekmachine = new Zoekmachine(lijst);

        // Test
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer een symptoom in:");
        String input = sc.nextLine().toLowerCase();
        List<String> symptomen = Arrays.asList(input.split(" "));

        List<Ziekte> gevonden = zoekmachine.zoekZiekteOpSymptomen(symptomen);
        if (gevonden.isEmpty()) {
            System.out.println("Geen ziekten gevonden.");
        } else {
            for (Ziekte z : gevonden) {
                System.out.println("Gevonden ziekte: " + z.getSamenvatting());
            }
        }
    }
}
//