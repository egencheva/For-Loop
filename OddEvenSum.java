import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.next());
            if (i % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        int diff = Math.abs(sumEven - sumOdd);
        if (diff == 0) {
            System.out.printf("Yes %nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}