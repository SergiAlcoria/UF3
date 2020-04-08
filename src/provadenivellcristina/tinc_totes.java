package provadenivellcristina;

import java.util.Arrays;
import java.util.Scanner;

public class tinc_totes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        int llargada = sc.nextInt();
        int N[] = new int[llargada];
        int count = 0;

        for (int i = 0; i < llargada; i++){
            N[i] = sc.nextInt();
        }

        Arrays.sort(N);

        for (int x = 0; x < N.length; x++){
            if (x + 1 == N[x]){
                count++;
            }
        }

        if (count == llargada){
            System.out.println("SI");
        } else
            System.out.println("NO");
    }
}
