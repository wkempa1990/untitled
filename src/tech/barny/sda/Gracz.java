package tech.barny.sda;

import java.util.Scanner;

public class Gracz {

    private Scanner scanner = new Scanner(System.in);

    public Współrzędne następnyRuch(Pole[][] plansza) {
        drukuj(plansza);
        System.out.println("Podaj swój następny ruch: ");
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        Współrzędne współrzędne = new Współrzędne(x,y);

        return new Współrzędne(x, y);
    }

    private void drukuj(Pole[][] plansza) {
        for (Pole[] rząd : plansza) {
            System.out.printf("|%c|%c|%c|%n",
                    rząd[0].getZnak(),
                    rząd[1].getZnak(),
                    rząd[2].getZnak()
            );
        }
    }

}
