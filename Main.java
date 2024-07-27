import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        // Get Elements from the Scanner
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Print elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < c; i++) {
            System.out.print("[");
            for (int j = 0; j < r; j++) {
                if(j==r-1){
                    System.out.print(arr[i][j]);
                }else{
                    System.out.print(arr[i][j] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }

        // Print the diagonal elements
        System.out.println("Diagonal elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Print alternate elements
        System.out.println("Alternate elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j == c - i - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Transpose of the Matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) {
            
            System.out.print("[");
            for (int j = 0; j < r; j++) {
                if (j == r - 1) {
                    System.out.print(arr[j][i]);
                } else {
                    System.out.print(arr[j][i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
