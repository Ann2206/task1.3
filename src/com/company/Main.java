package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();

        if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Год високосный");
        } else if (year % 400 == 0 ) {
            System.out.println ( "Год високосный" );
        }else {
            System.out.println("Год не високосный");
        }
    }
}

