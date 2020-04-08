package com.company.examUF12019;

import java.util.Scanner;

public class matriusSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //varibales
        int Case = sc.nextInt();
        int M[][] = new int[3][3];



        for (int r = 0; r <= M.length; r ++) {
            for (int c = 0; c <= M.length; c++) {
                M[r][c] = sc.nextInt();
            }
        }

        int max = M[0][0];
        for (int r = 0; r <= M.length; r ++) {
            for (int c = 0; c <= M.length; c++) {
                if (M[r][c] > max) {
                    max = M[r][c];
                }
            }
        }



    }
}
