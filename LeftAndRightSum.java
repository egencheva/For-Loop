import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.next());
            sumLeft += num;
        }
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.next());

            sumRight += num;
        }
        int diff=Math.abs(sumLeft-sumRight);
        if (diff==0) {
            System.out.printf("Yes, sum=%d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
