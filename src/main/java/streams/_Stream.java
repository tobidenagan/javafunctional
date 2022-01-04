package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Tobi", MALE),
                new Person("Laide", FEMALE),
                new Person("Ade", MALE),
                new Person("Rose", FEMALE),
                new Person("Smith", MALE),
                new Person("Alan", PREFER_NOT_TO_SAY)
        );

//        people.stream()
//                .map(person -> person.name)
////                .collect(Collectors.toSet())
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean allFemale = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println("allFemale = " + allFemale);

        boolean anyFemale = people.stream()
                .anyMatch(person -> person.gender.equals(FEMALE));
        System.out.println("anyFemale = " + anyFemale);

        boolean noneMatchResult = people.stream()
                .noneMatch(person -> person.gender.equals(PREFER_NOT_TO_SAY));
        System.out.println("noneMatchResult = " + noneMatchResult);
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

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
