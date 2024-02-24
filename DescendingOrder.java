import java.util.Scanner;

public class DescendingOrder {
    public static int arrayLength(int[] arr) {
        int length = 0;
        for (int i : arr) {
            length++;
        }
        return length;
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void descendingBubbleSort(int arr[]){
        for(int i=0;i < arrayLength(arr);i++){
            for(int j=i+1;j<arrayLength(arr);j++){
                if(arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arrayLength(arr);i++){
            if(i==arrayLength(arr)-1){
                System.out.print(arr[i]);
            }else{
            System.out.print(arr[i] + " --> ");
            }
        }
    }
    public static int getSize(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.close();
        return size;
    }
    public static void getElements(int[] arr,int size){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array with white space: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void main(String[] args) {
        int size = getSize();
        int[] arr = new int[size] ;
        getElements(arr,size);
        System.out.print("Before Sorting in descending order: ");
        display(arr);
        descendingBubbleSort(arr);
        System.out.print("\nAfter sorting in Descending order:  ");
        display(arr);
        
    }
}
