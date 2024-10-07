package vezerlo;

import modell.Ember;
import nezet.EmberNezet;

public class EmberVezerlo {

    Ember modell;
    EmberNezet nezet;

    public EmberVezerlo() {

        this.modell = new Ember("Józsi", 23, true);
        this.nezet = new EmberNezet();

        modell.nyelvetTanul("Angol");
        this.nezet.kiiras(this.modell.getBemutatkozasSzoveg());
    }

}
