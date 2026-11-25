package ex2;

public class Admin extends User {

    void deleteUser(String username){
        if (username != null && !username.isBlank())
            System.out.println("User deleted: " + username);
        else{
            System.out.println("Invalid username");
        }
    }
}
