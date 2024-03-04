import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of first matrix: ");
        int rows = sc.nextInt();

        System.out.print("\nEnter the number of columns of first matrix: ");
        int columns = sc.nextInt();

        int[][] arr =new int[rows][columns];

        System.out.print("\nEnter the elements of the first array:\n ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int mainDiagonalSum=0;
        while(i<rows && i < columns){
            mainDiagonalSum += arr[i][i];
            i++;
        }
        System.out.println("Sum of Main Diagonal: "+mainDiagonalSum);
        int j=columns-1;
        i=0;
        int subDiagonalSum=0;
        while(i<rows && j>=0){
            subDiagonalSum += arr[i][j];
            i++;
            j--;
        }
        System.out.println("Sum of Sub Diagonal: "+subDiagonalSum);

        sc.close();
    }
}
