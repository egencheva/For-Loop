import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
          num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
        }
        System.out.print(sum);
    }
}
