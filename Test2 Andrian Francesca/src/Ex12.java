// incerc sa fac tot ex in engleza

class Pet {
    private String name;

    public Pet (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Giraffe extends Pet {
    public Giraffe(String name) {
        super(name);   // folosesc super ca sa pot apela constructorul clasei principale
    }
}
public class Ex12 {
    public static void main(String[] args) {

        Giraffe giraffe = new Giraffe("Camelopardis");
        System.out.println("The giraffe's name is: " + giraffe.getName());

    }

}
