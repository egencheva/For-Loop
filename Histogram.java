import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int count = 0;
        double p1 = 0.00;
        double p2 = 0.00;
        double p3 = 0.00;
        double p4 = 0.00;
        double p5 = 0.00;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.next());
            count = count + 1;
            if (num < 200) {
                p1++;
            } else if (num >= 200 && num < 400) {
                p2++;
            } else if (num >= 400 && num < 600) {
                p3++;
            } else if (num >= 600 && num < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        double p1Percent = p1 / n * 100;
        double p2Percent = p2 / n * 100;
        double p3Percent = p3 / n * 100;
        double p4Percent = p4 / n * 100;
        double p5Percent = p5 / n * 100;


        System.out.printf("%.2f%% %n",p1Percent );
        System.out.printf("%.2f%% %n",p2Percent );
        System.out.printf("%.2f%% %n",p3Percent );
        System.out.printf("%.2f%% %n",p4Percent );
        System.out.printf("%.2f%% %n",p5Percent );

    }
}
