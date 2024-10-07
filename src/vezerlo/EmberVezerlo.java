package vezerlo;

import java.util.ArrayList;
import modell.Ember;
import nezet.EmberNezet;

public class EmberVezerlo {

    Ember modell;
    EmberNezet nezet;

    public EmberVezerlo() {
        ArrayList<String> nyelvek = new ArrayList();
        nyelvek.add("Angol");
        nyelvek.add("Magyar");

        this.modell = new Ember("Józsi", 23, nyelvek, true);
        this.nezet = new EmberNezet();

        this.nezet.kiiras(this.modell.bemuatatkozás());
    }

}
