public class Ex9 {
    public static void main(String[] args) {
        int laturaPatratului = 8;
        int perimetrulPatratului = calculeazaPerimetru(laturaPatratului);
        System.out.println("Perimetrul patratului: " + perimetrulPatratului + " cm.");
    }
    public static int calculeazaPerimetru (int laturaPatratului) {
        return 4 * laturaPatratului;
    }


}
