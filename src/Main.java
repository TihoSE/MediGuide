import model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Gebruiker gebruiker = new Gebruiker("U1", "Raymond", "Nederlands");

        Ziekte griep = new Ziekte("Z1", "Griep", "Virale infectie", Ernst.Matig, "griep.jpg");

        griep.voegSymptoomToe(new Symptoom("S1", "koorts", "Hoge temperatuur", "Z1"));
        griep.voegSymptoomToe(new Symptoom("S2", "vermoeidheid", "Lage energie", "Z1"));

        SoortBehandeling b1 = new Medicijn("B1", "Paracetamol", "Tegen koorts en pijn", "medicatie");
        SoortBehandeling b2 = new Operatie("B2", "Keelamandeloperatie", "Verwijderen van keelamandelen", "chirurgisch");
        griep.voegBehandelingToe(b1);
        griep.voegBehandelingToe(b2);

        Preventietip tip = new Preventietip("P1", "Was je handen regelmatig", "Z1");
        griep.voegPreventietipToe(tip);

        List<Ziekte> database = new ArrayList<>();
        database.add(griep);

        Zoekmachine zoekmachine = new Zoekmachine(database);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer symptomen in (gescheiden door spatie):");
        String input = scanner.nextLine().toLowerCase();
        List<String> symptomen = Arrays.asList(input.split(" "));

        List<Ziekte> gevonden = zoekmachine.zoekZiekteOpSymptomen(symptomen);

        if (gevonden.isEmpty()) {
            System.out.println("Geen ziekten gevonden.");
        } else {
            for (Ziekte z : gevonden) {
                System.out.println("\n🦠 Ziekte gevonden: " + z.getSamenvatting());

                for (SoortBehandeling b : z.getBehandelingen()) {
                    System.out.println("💊 Behandeling: " + b.getDetails());
                }

                for (Preventietip p : z.getPreventietips()) {
                    System.out.println("✅ Preventietip: " + p.getTekst());
                }
            }
        }
    }
}
