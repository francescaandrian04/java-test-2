// Primul principiu - encapsulare

class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisezInfo() {
        System.out.println("Numele: " + nume + ", varsta:" + varsta + "ani");
    }
}

// al doilea - mostenire
class Elev extends Persoana {
    private String nota;

    public Elev(String nume, int varsta, String nota) {
        super(nume, varsta); // asa apelez constructorul clasei parinte
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    public void afisezInfo() {
        super.afisezInfo();
        System.out.println("Nota elevului: " + nota);
    }
}

// al treilea - polimorfism
class Profesoara extends Persoana {
    private String materie;

    public Profesoara(String nume, int varsta, String materie) {
        super(nume, varsta);
        this.materie = materie;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public void afiseazInfo() {
        super.afisezInfo();
        System.out.println("Materia: " + materie);
    }
}

public class Ex13 {
    public static void main(String[] args) {
        Persoana elev = new Elev("Francesca", 20, "10");
        Persoana profesoara = new Profesoara("Doamna Elena", 45, "Engleza");

        elev.afisezInfo();
        profesoara.afisezInfo();
    }
}
