package com.krupesh;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        describe fruit
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            default -> System.out.println("please select valid fruit");
        }
    }
}
