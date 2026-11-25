package Ex1;

public class User {
//    შექმენით კლასი User, რომელსაც ექნება შემდეგი ველები:
//            ● username → String | password → String | age → int
//    მოთხოვნები:
//            1. სამივე ველი უნდა იყოს private.
//            2. თითოეული ველისთვის შექმენით Setter მეთოდი
//3. შექმენით მეთოდი validateUser(), რომელიც შეამოწმებს:
//            ○ თუ username ცარიელი არ არის
//○ თუ password შედგება მინიმუმ 8 სიმბოლოსგან
//○ თუ age არის 18 ან მეტი
//4. თუ სამივე პირობა სრულდება, დაბეჭდეთ "User validation passed", წინააღმდეგ
//    შემთხვევაში დაბეჭდეთ "User validation failed".
//            5. Main კლასში შექმენით ორი განსხვავებული მომხმარებლის ობიექტი, მიანიჭეთ მათ
//    მნიშვნელობები Setter მეთოდების გამოყენებით და გამოიძახეთ validateUser()
//    მეთოდი ორივეზე.

    private String userName;
    private String password;
    private int age;

    public void setUserName(String UserName) {
        userName = UserName;
    }

    void setPassword(String Password){
        password = Password;
    }

    void setAge(int Age){
        age = Age;
    }


    public void validateUser(){
        String result = userName != null && !userName.isBlank() && password.length() >=8 && age >= 18
                ? "User validation passed" : "User validation failed";
        System.out.println(result);
    }
}
