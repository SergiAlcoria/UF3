package provadenivellcristina;

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables
        String nota = sc.next();

        //per poder agafar el primer nombre del stringi que es puguin fer els ifs s'ha de fer aixo (en Jordi ho ha trobat)
        int notafinal = Integer.parseInt(String.valueOf(nota.charAt(0)));

        //cada if representa una nota
        if (notafinal >= 9){
            System.out.println("Excel·lent");
        } else if (notafinal >= 7){
            System.out.println("Notable");
        } else if (notafinal >= 5){
            System.out.println("Suficient");
        } else
            System.out.println("Insuficient");
    }
}
