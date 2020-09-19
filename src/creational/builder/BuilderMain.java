package creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        final Person person = new Person.PersonBuilder("Joginder", "Kumar").age(27).build();

        System.out.println(person);
    }

}
