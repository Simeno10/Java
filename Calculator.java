import java.util.Scanner;
import java.util.SortedMap;
import static org.junit.Assert.assertEquals;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę.");
        int wiek = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj drugą.");
        int x = scanner.nextInt();
        System.out.println("Wynik dodawania to: "+(wiek+x));
        System.out.println("Wynik odejmowania to: "+(wiek-x));
        System.out.println("Wynik mnożenia to: "+(wiek*x));
        System.out.println("Wynik dzielenia to: "+(wiek/x));
}
}

