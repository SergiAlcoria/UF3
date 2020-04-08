package provadenivellcristina;

import java.util.Scanner;

public class numeros_fantastics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        String[] N;
        String entrada;
        int numlength;
        int count = 0;
        int total = 0;

        // preguntar nums
        entrada = sc.nextLine();

        // guardar numero
        N = entrada.split(" ");

        for (int i = 0; i < N.length; i++) {
            count = 0;
            for (int j = 0; j < N[i].length(); j++) { //llegeix numero
                if (j / 2 == 0 && Integer.parseInt(String.valueOf(N[i].charAt(j))) / 2 != 0) { //comprova parell
                    count++;
                }

                else if (j / 2 != 0 && Integer.parseInt(String.valueOf(N[i].charAt(j))) / 2 == 0) { //comprova imparell
                    count++;
                }
            }

            if (count == N[i].length() - 1) {
                total++;
            }
        }

        System.out.println(total);
    }
}
