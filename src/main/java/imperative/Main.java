package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Tobi", MALE),
                new Person("Laide", FEMALE),
                new Person("Ade", MALE),
                new Person("Rose", FEMALE),
                new Person("Smith", MALE)
        );

        System.out.println("// Imperative approach");
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        // Declarative approach
        people.stream()
                .filter(person -> person.gender.equals(FEMALE))
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE;
    }
}
