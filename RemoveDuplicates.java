import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates {
    public static int arrayLength(int[] arr){
        int length=0;
        for(int i : arr){
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of array one with spaces: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.printf("%d ", arr[i]);
                i++;
            }
        }
        System.out.printf("%d", arr[size - 1]);
        sc.close();
    }
}
