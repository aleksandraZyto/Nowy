package mypackage.builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
            .firstName("Szymon")
            .age(23)
            .lastName("Nowak")
            .phoneNumber("66734583457")
                .build();
        System.out.println(user);


    }
}
