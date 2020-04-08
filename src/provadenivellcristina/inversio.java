package provadenivellcristina;

import java.util.Scanner;

public class inversio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String paraula = sc.nextLine();
        String paraulaInvertida = new StringBuilder(paraula).reverse().toString();
        //StringBuilder segons tinc entés permet modificar amb varies funcions

        //printar
        System.out.println(paraulaInvertida);
    }
}
