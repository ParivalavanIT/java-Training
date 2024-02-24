import java.util.Scanner;
public class MatrixMultiplication {
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
        System.out.print("Enter the number of rows of second matrix: ");
        int rows2 = sc.nextInt();

        System.out.print("\nEnter the number of columns of second matrix: ");
        int columns2 = sc.nextInt();

        int[][] arr2 = new int[rows][columns];

        System.out.print("\nEnter the elements of the second array:\n ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if(columns==rows2){
            int[][] resultMatrix =new int[rows][columns2];

            System.out.println("Multiplied Matrix is :");
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns2;j++){
                    for(int k=0;k<columns;k++){
                        resultMatrix[i][j] += arr[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns2;j++){
                    System.out.print(resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("Cannot multiplied");
        }
        sc.close();

    }
}
