public class Ex1 {
    public static void main(String[] args) {
        // byte in short
        byte valoareByte = 123;
        short valoareShort = (short) valoareByte;
        System.out.println("Conversie din byte in short: " + valoareShort);

        // int in double
        int valoareInt = 1900;
        double valoareDouble = (double) valoareInt;
        System.out.println("Conversie din int in double: " + valoareDouble);

        // long in int
        long valoareLong = 41684886L;
        int valoareIntNou = (int) valoareLong;
        System.out.println("Conversie din long in int: " + valoareIntNou);
    }
}

