import java.util.Scanner;

public class OddSumAndEvenSum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array :");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.print("Enter the elements of array one with spaces:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int oddSum=0;
        int evenSum=0;
        for (int i = 0; i < size; i++) {
            if(arr[i] % 2==0){
                evenSum = evenSum + arr[i];
            }else{
                oddSum = oddSum + arr[i];
            }
        }
        System.out.printf("The Sum of all Odd numbers in this array is \"%d\"\n", oddSum);
        System.out.printf("The Sum of all Even numbers in this array is \"%d\"\n", evenSum);
        sc.close();
    }
}