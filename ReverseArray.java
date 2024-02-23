import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of array with spaces:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Reversed Array: ");
        for(int i=size-1;i>=0;i--){
            if(i==0){
            System.out.print(arr[i]);
            }else{
            System.out.print(arr[i] + " -> ");
            }
        }
    }
}
