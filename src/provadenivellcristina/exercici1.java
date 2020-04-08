package provadenivellcristina;

import java.util.Scanner;

public class exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        int H = 0;
        int M = 0;

        //preguntar el num:
        H = sc.nextInt();
        M = sc.nextInt();

        //calcul
        System.out.println(((23 - H) * 60) + (60 - M));
    }
}
