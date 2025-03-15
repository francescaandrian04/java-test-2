class Pufuleti {
    String nume;

    public Pufuleti (String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }
}

class Camion {
    Pufuleti puf1;
    Pufuleti puf2;

    public void incarcPufuletii(Pufuleti pf1, Pufuleti pf2) {
        this.puf1 = pf1;
        this.puf2 = pf2;
        System.out.println(pf1.getNume() + " cu " + pf2.getNume() + " au fost incarcati in camion.");

    }

    public void transport(String destinatia) {
        System.out.println("Camionul transporta pufuletii la " + destinatia + ".");
        System.out.println("-------------------");
        System.out.println(puf1.getNume() + " a ajuns la " + destinatia + ".");
        System.out.println(puf2.getNume() + " a ajuns la " + destinatia + ".");
    }
}

public class Ex8 {

    public static void main(String[] args) {
        Pufuleti cristinuta = new Pufuleti("Cristinuta");
        Pufuleti cristinel = new Pufuleti("Cristinel");

        Camion camion = new Camion();
        camion.incarcPufuletii(cristinuta, cristinel);

        camion.transport("Nr1");
        camion.transport("Linella");
        camion.transport("Metro");

    }

}
