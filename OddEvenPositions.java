import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "#.###";
        Format decimalFormat = new DecimalFormat(pattern);

        double n = Double.parseDouble(scanner.nextLine());
        double oddSum = 0;
        double oddMin = 1000000;
        double oddMax = -1000000;
        double evenSum = 0;
        double evenMin = 1000000;
        double evenMax = -1000000;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum = oddSum + num;
                if (num > oddMax) {
                    oddMax = num;
                }

                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        System.out.println("OddSum=" + decimalFormat.format(oddSum) + ",");
        if (oddMin != 1000000) {
            System.out.println("OddMin=" + decimalFormat.format(oddMin) + ",");
        } else {
            System.out.println("OddMin=No,");
        }
        if (oddMax != -1000000) {
            System.out.println("OddMax=" + decimalFormat.format(oddMax) + ",");
        } else {
            System.out.println("OddMax=No");
        }

        System.out.println("EvenSum=" + decimalFormat.format(evenSum) + ",");
        if (evenMin != 1000000) {
            System.out.println("EvenMin=" + decimalFormat.format(evenMin) + ",");
        } else {
            System.out.println("EvevnMin=No,");
        }
        if (evenMax != -1000000) {
            System.out.print("EvenMax=" + decimalFormat.format(evenMax)+ ",");
        } else {
            System.out.println("EvenMax=No");
        }

    }
}