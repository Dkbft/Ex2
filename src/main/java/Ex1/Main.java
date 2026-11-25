package Ex1;

public class Main {
    static void main() {
        User user1 = new User();
        user1.setUserName("ana");
        user1.setPassword("asdasdaasdasdsdasd");
        user1.setAge(23);

        user1.validateUser();

        User user2 = new User();
        user2.setUserName("  ");
        user2.setPassword("asdasdada");
        user2.setAge(17);

        user2.validateUser();
    }
}
