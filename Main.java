import org.junit.Test;

import java.util.Scanner;
import java.util.SortedMap;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie.");
        String imie= scanner.nextLine();
        System.out.println("Podaj wiek.");
        int wiek = scanner.nextInt();

        System.out.printf("Cześć "+imie+". Masz "+wiek+" lat.");
    }

    @Test
    public void testMultiplication()
    {
        // Testing if 2*2=4:
        assertEquals ("Multiplication", 5, 2*2);
    }
}