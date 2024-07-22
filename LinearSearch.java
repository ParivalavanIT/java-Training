public class LinearSearch {
    public static int linearSearch(int[] arr,int pos,int key){
        if (pos > arr.length-1) {
            return -1;
        }
        if(arr[pos]==key){
            return pos;
        }else{
            return linearSearch(arr, pos+1, key);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        int key = 0;
        int index = linearSearch(arr, 0, key);
        System.out.println(index);
    }
}
