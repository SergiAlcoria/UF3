package com.company.examUF12019;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        //costats dels triangles
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("SI");
            } else
                System.out.println("NO");
    }
}