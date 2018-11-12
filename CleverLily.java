import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double totalSum = 0;
        int countEven = 1;
        int toysN = 0;
        double priceWM = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                sum = sum + 10 * countEven;
                countEven++;
            } else {
                toysN++;
            }
        }
        totalSum = sum - (countEven - 1) + toysN * priceToy;
        if (totalSum >= priceWM) {
            System.out.printf("Yes! %.2f", totalSum - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - totalSum);
        }
    }
}
