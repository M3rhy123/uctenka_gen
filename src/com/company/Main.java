package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kolik chcete banánů?");
        int banany = sc.nextInt();
        double cenaBanan = 3.90;
        double celkemBanan = cenaBanan*banany;

        System.out.println("Kolik chcete krabic trvanlivého mléka?");
        int mleko = sc.nextInt();
        double cenaMleko = 19.90;
        double celkemMleko = cenaMleko*mleko;

        System.out.println("Kolik chcete rohlíků?");
        int rohlik = sc.nextInt();
        double cenaRohlik = 1.90;
        double celkemRohlik = cenaRohlik*rohlik;

        double celkem =celkemBanan+celkemMleko+celkemRohlik;;
        double bdph = (celkem)/100*85;

        System.out.print("Banán ks: "+banany+"  Cena za kus: "+cenaBanan+"Kč  Celkem: ");
        System.out.format("%.2f",celkemBanan);
        System.out.println("Kč");
        System.out.print("Mléko ks: "+mleko+"  Cena za kus: "+cenaMleko+"Kč  Celkem: ");
        System.out.format("%.2f",celkemMleko);
        System.out.println("Kč");
        System.out.print("Rohlík ks: "+rohlik+"  Cena za kus: "+cenaRohlik+"Kč  Celkem: ");
        System.out.format("%.2f",celkemMleko);
        System.out.println("Kč");
        System.out.println(' ');
        System.out.print("Cena bez DPH: ");
        System.out.format("%.2f",bdph);
        System.out.println("Kč");
        System.out.print("Cena celkem:  ");
        System.out.format("%.2f",celkem);
        System.out.println("Kč");



    }
}
