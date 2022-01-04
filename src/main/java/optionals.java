import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
//        Object value = Optional.ofNullable("Hello")
////                .orElseGet(() -> "default value");
//                .orElseThrow(() -> new IllegalStateException("exception"));
//        System.out.println("value = " + value);

        Optional.ofNullable(null)
//                .ifPresent(email -> System.out.println("Sending email to " + email));
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));
    }
}
