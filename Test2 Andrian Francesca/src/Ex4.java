import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // citesc cele trei numere
        System.out.println("Introduceti primul numar: ");
        int nr1 = scanner.nextInt();

        System.out.println("Introduceti al doilea numar: ");
        int nr2 = scanner.nextInt();

        System.out.println("Introduceti al treilea numar: ");
        int nr3 = scanner.nextInt();
        
        // verific cele trei conditii
        if (nr1 == nr2) {
            if (nr2 == nr3) {
                System.out.println("Toate numerele introduse sunt egale.");
            } else {
                System.out.println("Nici nu sunt egale, nici diferite.");
            } 
        } else if (nr1 == nr3) {
            System.out.println("Nici nu sunt egale, nici diferite.");
        } else if (nr2 == nr3) {
            System.out.println("Nici nu sunt egale, nici diferite.");
        } else {
            System.out.println("Toate numerele sunt diferite");
        }

    }
}
