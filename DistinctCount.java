import java.util.Arrays;
import java.util.Scanner;
public class DistinctCount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array :");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.print("Enter the elements of array one with spaces:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int distinctSum =0;
        for(int i = 1; i<size; i++){
            if(arr[i] != arr[i-1]){
                distinctSum = distinctSum + arr[i-1];
            }
        }
        
        System.out.printf("The Sum of Distinct elements in array is \"%d\"",distinctSum+arr[size-1]);
        sc.close();
    }
}
