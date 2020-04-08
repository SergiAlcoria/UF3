package provadenivellcristina;

import java.util.Scanner;

public class sumatori_primers_numeros {
    private static int sumatori(int a) {
        if (a == 0){
            return a;
        } else
            return a + sumatori(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //varibales
        int numero = 0;

        //preguntar numero
        numero = sc.nextInt();

        //cridar funcio
        System.out.println(sumatori(numero));
    }
}
