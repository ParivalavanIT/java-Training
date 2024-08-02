import java.util.Scanner;

public class JobScheduling {
    
    public static int minOperationsToEqualize(int n, int[] A, int[] B) {
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        

        for (int i = 0; i < n; i++) {
            if (A[i] < minA) {
                minA = A[i];
            }
            if (B[i] < minB) {
                minB = B[i];
            }
        }
        
        int totalOperations = 0;

        for (int i = 0; i < n; i++) {
            int reduceA = A[i] - minA;
            int reduceB = B[i] - minB;
            totalOperations += Math.max(reduceA, reduceB);
        }
        
        return totalOperations;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] A = new int[n];
        int[] B = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        
        int result = minOperationsToEqualize(n, A, B);
        
        System.out.println(result);
        
        sc.close();
    }
}
