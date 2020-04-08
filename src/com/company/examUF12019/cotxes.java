package com.company.examUF12019;

import java.util.Scanner;

public class cotxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String petrol = sc.next();
        int year = sc.nextInt();

        if (petrol.equals("electric")) {
            System.out.println("0" + " " + (2020 - year));
        } else if (petrol.equals("gasolina") && year > 2006 || petrol.equals("diesel") && year > 2014) {
            System.out.println("B" + " " + (2020 - year));
        } else if (petrol.equals("gasolina") && year > 2000 || petrol.equals("diesel") && year > 2006) {
            System.out.println("C" + " " + (2020 - year));
        } else
            System.out.println("cap" + " " + (2020 - year));
    }
}
