package creational.builder;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int height;

    Person(final PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [firstName=");
        builder.append(firstName);
        builder.append(", middleName=");
        builder.append(middleName);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append(", age=");
        builder.append(age);
        builder.append(", height=");
        builder.append(height);
        builder.append("]");
        return builder.toString();
    }

    static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private int height;

        public PersonBuilder(final String firstName, final String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder height(final int height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
