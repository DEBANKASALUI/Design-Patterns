package Builder;

public class User {
    private final int userId;
    private final String name;
    private final String city;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.city = builder.city;

    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static class UserBuilder {

        private int userId;
        private String name;
        private String city;

        public UserBuilder() {
        }

        public static UserBuilder getUserBuilder() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}





