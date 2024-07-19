import java.util.Scanner;
public class Josephus {
    public static int josephus(int n, int k) {
        if (n == 1) return 0;
        else return (josephus(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       System.out.println(josephus(n, k) + 1);
       sc.close();
    }
}
