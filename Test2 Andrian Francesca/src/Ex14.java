public class Ex14 {
    public static void main(String[] args) {

        try {
            throw new Exception("Aceasta este o eroare!");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
