package com.krupesh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Krupesh Vithlani");
            case 2 -> System.out.println("Srijanna Das");
            case 3 -> {
                System.out.println("Emp No 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                    case "Managment":
                        System.out.println("Managment Deparment");
                }
            }
            default -> System.out.println("enter correct employee id");
        }
    }
}
