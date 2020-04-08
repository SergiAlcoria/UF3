package provadenivellcristina;

import java.util.Scanner;

public class sumatori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        int num = sc.nextInt();
        int[] N = new int[num]; //aqui van els numeros que es s'indiquen
        int[] R = new int[num]; //aqui van els resultats de les operacions

        //posar els numeros al array
        for (int i = 0; i < N.length; i++){
            N[i] = sc.nextInt();
        }

        //calcul
        for (int i = 0; i < N.length; i++){
            R[i] = N[i] + N[N.length - 1];
        }

        //printar R
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
    }
}
