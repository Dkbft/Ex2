package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Admin adm = new Admin();
        adm.userName = "ana";
        adm.displayRole();
        adm.checkAccess();
    }
}
