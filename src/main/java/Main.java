import java.util.Scanner;
//Choinka projekt

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Print kwadratu 6x6
    System.out.println("Podaj rozmiar kwadratu: ");
    int rozmiar = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Podaj jakim znakiem ma byc drukowany kwadrat: ");
    char znak = scanner.next().charAt(0);
    scanner.nextLine();

    for (int i = 0; i < rozmiar; i++) {
      for (int j = 0; j < rozmiar; j++) {
        System.out.print(znak);
      }
      System.out.println();
    }

    // Print choinki
    System.out.println("Podaj rozmiar gory choinki: ");
    int Gora = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Podaj rozmiar srodka choinki: ");
    int Srodek = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Podaj rozmiar pnia choinki: ");
    int Pien = scanner.nextInt();
    scanner.nextLine();

    // Góra choinki
    for (int i = 0; i <= Gora; i++) {
      for (int j = 0; j <= Gora - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Środek choinki
    for (int i = 0; i < Srodek; i++) {
      for (int j = 0; j < Gora - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i * 2) + 3; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Pień choinki
    for (int i = 0; i < Pien; i++) {
      for (int j = 0; j < Gora - 1; j++) {
        System.out.print(" ");
      }

      System.out.println("|||");
    }
  }
}