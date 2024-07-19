public class ArraySum {
    public static int arraySum(int[] arr,int size){
        if(size==0){
            return arr[size];
        }
        return arr[size]+arraySum(arr,size-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arraySum(arr, arr.length-1));
    }
}
