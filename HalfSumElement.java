import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxN = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (maxN < num) {
                maxN = num;
            }
            sum = sum + num;
        }
        int diff = Math.abs(maxN - (sum-maxN));
        int half = maxN-(sum-maxN);

        if (half == 0) {
            System.out.printf("Yes%nSum = %d ",maxN);
        }else{
            System.out.printf("No%nDiff = %d ",diff);
        }

    }
}
