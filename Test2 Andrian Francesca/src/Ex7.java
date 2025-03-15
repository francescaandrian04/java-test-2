public class Ex7 {
    public static void main(String[] args) {

        String text = "Programare Java";

        // elimin spatiul utilizand replace dar se poate si cu split/join
        String eliminSpatiul = text.replace(" ", "");

        System.out.println("Noul text: " + eliminSpatiul);
    }
}
