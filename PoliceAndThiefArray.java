import java.util.Scanner;

public class PoliceAndThiefArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter the elements of array either 'P' or 'T' ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().toUpperCase().charAt(0);
        }
        System.out.println("Enter the range");
        int range = sc.nextInt();
        if(catchThieves(arr, range)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean catchThieves(char[] arr, int range) {
        int thiefCaughtCount = 0;
        int n = arr.length;
        int thiefCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'T') {
                thiefCount++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') {
                int left = Math.max(0, i - range);
                int right = Math.min(n - 1, i + range);
                
                for (int j = left; j <= right; j++) {
                    if (arr[j] == 'T') {
                        arr[j] = 'C'; 
                        thiefCaughtCount++;
                        break;
                    }
                }
            }
        }
        System.out.println("Thieves: " + thiefCaughtCount);
        return (thiefCaughtCount >= thiefCount);
    }
}
