import org.junit.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.SortedMap;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj imie.");
        //String imie= scanner.nextLine();
        //System.out.println("Podaj wiek.");
        //int wiek = scanner.nextInt();

        //System.out.println("Cześć "+imie+". Masz "+wiek+" lat.");
        double a = 3, b = 2;
        double c = (Math.round((b / a)*100))/100.0;
        int a2 = 5, b2 = 2;
        int c2 = a2 % b2;
        double x = 7, y = 3;
        double d = Math.ceil(x/y), e = Math.floor(x/y);
        System.out.println(c);
        System.out.println(d+" "+e);
        System.out.println(c2);
        BigDecimal roundedNumber = new BigDecimal(y/x).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundedNumber.doubleValue());

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(x/y));

        String formattedNumber = String.format("%.2f", a/b);
        System.out.println(formattedNumber);


    }

    @Test
    public void testMultiplication()
    {
        // Testing if 2*2=4:
        assertEquals ("Multiplication", 6, 3*2);
    }
}
