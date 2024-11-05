package Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        UserManagement u1 = new UserManagement();
        u1.addUser(new User("Harry Potter", "AB100"));
        u1.addUser(new User("James Potter", "AB200"));
        u1.addUser(new User("Lily Potter", "AB300"));
        u1.addUser(new User("Sirius Black", "AB400"));
        u1.addUser(new User("Severus Snape", "AB500"));
        MyIterator myIterator = u1.getIterator();
        while (myIterator.hasNext()) {
            User user=(User)myIterator.next();
            System.out.println(user.getUserID()+", "+user.getName());
        }

    }
}
