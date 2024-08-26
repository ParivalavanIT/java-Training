import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("---");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(num + "*");
                num++;
            }
            for (int j = n; j > i; j--) {
                System.out.print((j + n) + "*");
                num++;
            }
            System.out.println();
        }
    }
}