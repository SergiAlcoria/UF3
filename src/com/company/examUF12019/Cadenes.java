package com.company.examUF12019;

import java.util.Scanner;

public class Cadenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String input = sc.next();;
        String output = "";
        int nRepeticionsI = 1; //I per saber que es un int
        String nRepeticionsS = "0"; //S per saber que es un String

        for (int i = 0; i < input.length(); i++) {
            if(Character.isAlphabetic(input.charAt(i))) {
                for (int x = 0; x < nRepeticionsI; x++) {
                    output += input.charAt(i);
                }
                nRepeticionsS = "0";
            } else {
                nRepeticionsS += input.charAt(i);
                nRepeticionsI = Integer.parseInt(nRepeticionsS);
            }

        }
        System.out.println(output);
    }
}
