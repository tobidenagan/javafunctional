package lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = String::toUpperCase;

        Function<String, String> upperCaseName2 = name -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseName3 = (name, age) -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println("age = " + age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName3.apply("Tobi", null));
    }

//    class Service {
//
//        public Consumer<String> blah = s -> {
//
//        };
//    }
}
