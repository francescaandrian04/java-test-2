import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg:");
        double nr = scanner.nextDouble();

        if (nr > 0) {
            System.out.println("Acest numar este positiv!");
        } else if (nr < 0) {
            System.out.println("Acest numar este negativ!");
        } else {
            System.out.println("Numarul este egal cu 0!");
        }

    }
}
