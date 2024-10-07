package vezerlo;

import java.util.ArrayList;
import modell.Ember;
import nezet.EmberNezet;

public class EmberVezerlo {

    Ember modell;
    EmberNezet nezet;

    public EmberVezerlo() {

        this.modell = new Ember("Józsi", 23, true);
        this.nezet = new EmberNezet();

        this.nezet.kiiras(this.modell.getBemutatkozasSzoveg());
        this.nezet.kiiras("\n");

        modell.oregszik();
        modell.nyelvetTanul("Angol");
        this.nezet.kiiras(this.modell.getBemutatkozasSzoveg());
        this.nezet.kiiras("\n");

        modell.nyelvetTanul("Francia");
        this.nezet.kiiras(this.modell.getBemutatkozasSzoveg());
        this.nezet.kiiras("\n");

        ArrayList<String> nyelvek = new ArrayList();
        nyelvek.add("Spanyol");
        this.modell = new Ember("Ernő", 55, nyelvek, false);
        this.nezet.kiiras(this.modell.getBemutatkozasSzoveg());
        this.nezet.kiiras("\n");
    }
}
