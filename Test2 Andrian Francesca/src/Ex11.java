public class Ex11 {
    public static void main(String[] args) {

        int nr = 11;

        do {
            nr++;
        } while (nr < 10);
        if (nr > 10) {
            System.out.println("Bucla nu se repeta, numarul e mai mare dacat 10: " + nr);
        }
    }
}
