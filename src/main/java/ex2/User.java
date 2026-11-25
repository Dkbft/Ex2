package ex2;

public class User {
//    შექმენით მშობელი კლასი User, რომელსაც ექნება შემდეგი ველები:
//            ● username → String | email → String
//    მოთხოვნები:
//            1. ორივე ველი უნდა იყოს protected.
//            2. შექმენით მეთოდი displayUserInfo(), რომელიც დაბეჭდავს მომხმარებლის სახელსა
//    და Email -ს.
//3. შექმენით შვილი კლასი Admin, რომელიც მიიღებს მშობელი კლასის ველებს
//    მემკვიდრეობით.
//4. Admin კლასში შექმენით მეთოდი deleteUser(String username), რომელიც მიიღებს
//    მომხმარებლის სახელს:
//            ○ თუ სახელი ცარიელი არ არის, დაბეჭდოს "User deleted: " + username.
//○ სხვა შემთხვევაში დაბეჭდოს "Invalid username".
//
//            6. main() მეთოდში შექმენით Admin კლასის ობიექტი, გამოიძახეთ displayUserInfo() და
//    deleteUser() მეთოდები.


    protected String userName;
    protected String email;


    void displayUserInfo(){
        System.out.println("name: " + userName + " email " + email);
    }


}
