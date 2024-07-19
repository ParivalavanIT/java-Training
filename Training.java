import java.util.Scanner;

public class Training {
    public static Boolean linearSearch(int[] arr,int key,int size){
            for(int i=0;i<size;i++){
                if(arr[i]==key){
                    return true;
                }
            }
            return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array Element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int key=sc.nextInt();
        if(linearSearch(arr, key, size)){
            System.out.println("Element present in the array");
        }
        else{
            System.out.println("Element not present");
        }

    }
}
