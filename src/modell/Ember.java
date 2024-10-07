package modell;

import java.util.ArrayList;

public class Ember {

    private String nev;
    private int kor;
    private ArrayList<String> nyelvek;
    private boolean szuletesnap;

    public Ember(String nev, int kor) {

        this(nev, kor, new ArrayList<String>(), false);
    }

    public Ember(String nev, int kor, ArrayList<String> nyelvek) {

        this(nev, kor, nyelvek, false);
    }

    public Ember(String nev, int kor, boolean szzuletesnap) {

        this(nev, kor, new ArrayList<String>(), szzuletesnap);
    }

    public Ember(String nev, int kor, ArrayList<String> nyelvek, boolean szuletesnap) {

        this.nev = nev;
        this.szuletesnap = szuletesnap;
        this.nyelvek = nyelvek;

        this.kor = this.szuletesnap ? ++kor : kor;

    }

    public String getBemutatkozassSzoveg() {

        String szoveg = "Szia, a nevem: ";
        szoveg += this.nev + "\nA korom: ";
        szoveg += this.kor;

        if (nyelvek.size() > 0) {
            szoveg += nyelvek.size() == 1
                    ? "\nEzen a nyelven tudok: "
                    : "\nEzeken a nyelveken tudok: ";

            szoveg += this.nyelvek;
        }

        return szoveg + "\n";
    }

    public void nyelvetTanul(String nyelv) {

        this.nyelvek.add(nyelv);
    }

}
