package _09_hiding.developer;

import _09_hiding.company.Emplyee;

public class Developer extends Emplyee{
    public void printInfo() {
        System.out.println(name);
        System.out.println(department);
        // System.out.println(email);
        // System.out.println(salary);
    }
}
