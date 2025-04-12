package model;

import java.util.ArrayList;
import java.util.List;

public class Zoekmachine {
    private List<Ziekte> ziekten;

    public Zoekmachine(List<Ziekte> ziekten) {
        this.ziekten = ziekten;
    }

    public List<Ziekte> zoekOpZiekte(String zoekterm) {
        List<Ziekte> resultaat = new ArrayList<>();
        for (Ziekte z : ziekten) {
            if (z.getNaam().toLowerCase().contains(zoekterm.toLowerCase())) {
                resultaat.add(z);
            }
        }
        return resultaat;
    }

    public List<Ziekte> zoekZiekteOpSymptomen(List<String> symptomenInput) {
        List<Ziekte> suggesties = new ArrayList<>();
        for (Ziekte z : ziekten) {
            for (Symptoom s : z.getSymptomen()) {
                if (symptomenInput.contains(s.getNaam().toLowerCase())) {
                    suggesties.add(z);
                    break;
                }
            }
        }
        return suggesties;
    }
}
