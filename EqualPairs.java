import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());
        int sumPair = 0;
        int lastPair = 0;
        int maxDiff = 0;
        int sum = 0;

        for (int i = 0; i < pairs; i++) {
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());
            sumPair = num1 + num2;

            if (i >= 1) {

                int diff = Math.abs(sumPair - lastPair);
                if (diff > maxDiff) ;
                {
                    maxDiff = diff;
                }
            }
            lastPair = sumPair;
        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", lastPair);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
