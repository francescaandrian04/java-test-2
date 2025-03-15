public class Ex6 {
    public static void main(String[] args) {
        String propozitie = "Ana are mere, pere, banane, mandarine si prune.";
        int primaAparitie = propozitie.indexOf('m');
        int ultimaAparitie = propozitie.lastIndexOf('m');

        // afisez
        if (primaAparitie != -1) {
            System.out.println("Prima aparitie a literei m este la pozitia nr: " + primaAparitie);
            System.out.println("Ultima aparitie a literei m este la pozitia nr: " + ultimaAparitie);
        } else {
            System.out.println("Litera m nu apare in propozitie!");
        }
    }
}
