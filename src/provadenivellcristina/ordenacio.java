package provadenivellcristina;

import java.util.Arrays;
import java.util.Scanner;

public class ordenacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //varibales
        int totalnumeros = sc.nextInt();
        int[] A = new int[totalnumeros]; //aqui van els numeros

        //omplenar el array
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        //ordenar el array de menor a major
        Arrays.sort(A);

        //printar A de menor a major
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println(); //s'ha de posar un espai si no no ho accepta

        //printar de major a menor
        for (int i = A.length - 1; i >= 0; i--){
            System.out.print(A[i] + " ");
        }
    }
}
