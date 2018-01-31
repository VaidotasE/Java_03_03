package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float suma = 0;
        float skaicius = 0;

        do {
            System.out.print("Ivesk skaiciu: ");
            skaicius = sc.nextFloat();
            suma += skaicius;


        } while (skaicius != 0);
        System.out.println("Suma: " + suma);

    }


}
