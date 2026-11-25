package org.example;

public interface Access {
//    1. შექმენით ინტერფეისი Access, რომელსაც ექნება მეთოდი: checkAccess() →
//    აბსტრაქტული მეთოდი.
//            2. შექმენით აბსტრაქტული კლასი User:
//            ● რომელსაც ექნება ველი username → String ტიპის
//● ასევე, აბსტრაქტული მეთოდი displayRole().
//            3. შექმენით კლასი Admin:
//            ● რომელიც იქნება User კლასისის მემკვიდრე
//● ასევე იმპლემენტაციას გაუკეთებს Access ინტერფეისს
//● displayRole() მეთოდმა უნდა დაბეჭდოს: "Role: Admin".
//            ● checkAccess() მეთოდმა უნდა დაბეჭდოს: "Access granted".
//            4. Main კლასში:
//            ● შექმენით Admin კლასის ობიექტი, მიანიჭეთ username -ს მნიშვნელობა და
//    გამოიძახეთ ორივე მეთოდი.

    void checkAccess();
}
