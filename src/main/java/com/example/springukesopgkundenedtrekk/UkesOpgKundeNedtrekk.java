package com.example.springukesopgkundenedtrekk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UkesOpgKundeNedtrekk {
    private final List<Kunde> kunder = new ArrayList<>();
    private final List<String> bilmerker = new ArrayList<>();
    //private String bilMerke;

    @GetMapping("hentKunder")
    public List<Kunde> alleKunder() {
        return kunder;
    }

    @PostMapping("lagreKunde")
    public void leggTilKunde(Kunde innKunde) {
        kunder.add(innKunde);
    }

    @GetMapping("slettAlleKunder")
    public void sletAlleKunder() {
        kunder.clear();
    }

    @GetMapping("hentBilmerker")
    public List<String> alleBilmerker() {
        bilmerker.clear();
        bilmerker.add("Audi");
        bilmerker.add("BMW");
        bilmerker.add("Tesla");
        return bilmerker;
    }

    @GetMapping("hentBilmodel")
public List<Bil> hentModel(String bilMerke) {
        List<Bil> bilModel = new ArrayList<>();
        if (bilMerke.equals("Audi")) bilModel = hentAudi();
        else if (bilMerke.equals("BMW")) bilModel = hentBMW();
        else if (bilMerke.equals("Tesla")) bilModel =hentTesla();
        return bilModel;
    }

    public List<Bil> hentAudi() {
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi", "A4"));
        listBiler.add(new Bil("Audi", "E-tron 55"));
        listBiler.add(new Bil("Audi", "RS6"));
        return listBiler;
    }

    public List<Bil> hentBMW() {
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("BMW", "i3"));
        listBiler.add(new Bil("BMW", "M4"));
        listBiler.add(new Bil("BMW", "320i"));
        return listBiler;
    }

    public List<Bil> hentTesla() {
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Tesla", "S"));
        listBiler.add(new Bil("Tesla", "X"));
        listBiler.add(new Bil("Tesla", "3"));
        listBiler.add(new Bil("Tesla", "Y"));
        return listBiler;
    }

}
