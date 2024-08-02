import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n + 2]; 
        A[0] = 1; 
        A[n + 1] = 1;

        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(maxProduct(A, n));
    }

    public static int maxProduct(int[] A, int n) {
        int[][] dp = new int[n + 2][n + 2];


        for (int l = 1; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k - 1] + A[i - 1] * A[k] * A[j + 1] + dp[k + 1][j]);
                }
            }
        }

        return dp[1][n];
    }
}
