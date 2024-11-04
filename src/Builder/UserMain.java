package Builder;

public class UserMain {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId(100)
                .setName("Harry Potter")
                .setCity("London")
                .build();
        System.out.println(user);

        User user1 = User.UserBuilder.getUserBuilder()
                .setUserId(101)
                .setName("James Potter")
                .build();
        System.out.println(user1);
    }
}
