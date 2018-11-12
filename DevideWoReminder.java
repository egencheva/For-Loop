import java.util.Scanner;

public class DevideWoReminder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int count = 0;
        double p1 = 0.00;
        double p2 = 0.00;
        double p3 = 0.00;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.next());
            count = count + 1;
            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }
        }
        double p1Percent = p1 / n * 100;
        double p2Percent = p2 / n * 100;
        double p3Percent = p3 / n * 100;

        System.out.printf("%.2f%% %n", p1Percent);
        System.out.printf("%.2f%% %n", p2Percent);
        System.out.printf("%.2f%% %n", p3Percent);
    }
}
