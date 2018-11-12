import java.util.Scanner;

public class Numbers1000ending7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 7) {
                num = i;
                System.out.println(num);
            }
        }
    }
}
