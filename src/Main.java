import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = scanner.nextInt();

            if (liczba < 0) {
                break;
            }
        }

        System.out.println("Koniec programu.");
    }
}