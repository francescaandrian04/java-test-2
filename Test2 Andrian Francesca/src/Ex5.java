public class Ex5 {
    public static void main(String[] args) {
        int [] nr = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < nr.length; i++) {
            suma += nr[i];
        }

        System.out.println("Suma elementelor este: " + suma);
    }
}
