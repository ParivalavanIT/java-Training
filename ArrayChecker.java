import java.util.Arrays;
import java.util.Scanner;
public class ArrayChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        System.out.print("Enter the elements of array one with spaces:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the elements of array two with spaces:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int flag=0;
        for (int i = 0; i < size; i++) {
            if(arr[i] != arr1[i]){
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("The given arrays are equal");
        }
        else{
            System.out.println("The given arrays are not equal");
        }
        flag =0;
        for (int i = 0; i < size; i++) {
            for(int j=0;i < size; i++){
                if (arr[i] < arr1[j]) {
                    flag++;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("The given arrays are compatible");
        }
        else{
            System.out.println("The given arrays are not compatible");
        }
    }
}
