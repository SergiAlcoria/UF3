package provadenivellcristina;

import java.util.Scanner;

public class idenificadors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String paraules;
        String P[];

        String camelCase = "";
        String snake_case = "";
        String kebabcase = "";

        //preguntar les paraules
        paraules = sc.nextLine().toLowerCase();

        P = paraules.split(" "); //assignar paraules al array amb un split

        //camelCase
        for (int i = 0; i < P.length; i++) {
            if (i == 0) {
                camelCase += P[i];
            } else {
                camelCase += P[i].substring(0, 1).toUpperCase() + P[i].substring(1); //buscat per internet
            }
        }

        //snake_case i kebab-case
        for (int x = 0; x < P.length; x++) {
            if (x == P.length - 1) {
                snake_case += P[x];
                kebabcase += P[x];
            } else {
                snake_case += P[x] + "_";
                kebabcase += P[x] + "-";
            }
        }

        System.out.println(camelCase);
        System.out.println(snake_case);
        System.out.println(kebabcase);
    }
}
