package ex2;

public class Main {
    static void main() {
        Admin admin = new Admin();
        admin.userName = "ana";
        admin.email = "ana@gmail.com";

        admin.displayUserInfo();
        admin.deleteUser(admin.userName);
    }
}
