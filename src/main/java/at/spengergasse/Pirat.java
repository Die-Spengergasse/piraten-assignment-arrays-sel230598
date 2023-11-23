package at.spengergasse;

public class Pirat {

    private String name;
    private int gesundheit;  // 0 - 100 
    private boolean holzbein;


    public Pirat(String name, int gesundheit, boolean holzbein) {
        setName(name);
        setGesundheit(gesundheit);
        setHolzbein(holzbein);
    }

    //getter
    public String getName() {
        return name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public boolean getHolzbein() {
        return holzbein;
    }

    //setter
    public void setName(String name) {
        if (name == null) {
            System.out.println("A r r g h ! Keinen Namen fuer den alten Seebaeren uebergeben!�");
            throw new IllegalArgumentException("Name darf nicht null sein");
        } else {
            this.name = name;
        }
    }

    public void setGesundheit(int gesundheit) {
        if (gesundheit >= 0 || gesundheit <= 100) {
            this.gesundheit = gesundheit;
        } else {
            System.out.println("Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
            throw new IllegalArgumentException("Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
        }
    }

    public void setHolzbein(boolean holzbein) {
        this.holzbein = holzbein;
    }

    //Methode Kielholen
    public void kielholen() {
        if (holzbein) {
            gesundheit -= 95;
        } else {
            gesundheit -= 90;
        }
        if (gesundheit <= 0) {
            gesundheit = 0;
            System.out.println("Pirat " + name + " stieg in Davy Jone’s Kiste");
        }
    }

    //Methode trinken
    public void trinken(char getraenk) {
        if (getraenk == 'w') {
            gesundheit -= 10;
        }
        if (getraenk == 'g') {
            gesundheit += 10;
        }
        if (getraenk == 'r') {
            gesundheit += 20;
        }
        if (gesundheit >= 100) {
            System.out.println("Haudegen " + name + " erfreut sich voller Gesundheit");
            gesundheit = 100;
        }
        if (gesundheit <= 0) {
            System.out.println("Haudegen " + name + "ging über die Planken.");
            gesundheit = 0;
        }
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String toReturn;
        String gesundheitInfo;
        String HolzbeinInfo;
        if (gesundheit >= 11 && gesundheit <= 100) {
            gesundheitInfo = gesundheit + " %";
        } else if (gesundheit >= 1 && gesundheit <= 10) {
            gesundheitInfo = this.gesundheit + "- hisst den Yellow Jack";
        } else {
            gesundheitInfo = "X - sprang in die Kiste";
        }
        if (holzbein) {
            HolzbeinInfo = "Holzbein";
        } else {
            HolzbeinInfo = "Zweifüßer";
        }
        toReturn = "Aye - Trunkenbold" + this.name + " meldet sich an Board!" + gesundheitInfo + HolzbeinInfo;
        return toReturn;
    }

}