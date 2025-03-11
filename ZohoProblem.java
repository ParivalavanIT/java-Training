public class ZohoProblem {
    public static boolean chaeckIndex(int[] arr) {
        int jump = arr[0];
        int count = 0;
        while (true) {
            if (jump == arr.length - 1) {
                return true;
            } else {
                if (jump == 0 || count > arr.length) {
                    return false;
                }
                jump = jump - 1;
                count++;
            }
            jump = arr[jump] + jump;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 2, 0, 1, 5 };
        System.out.println(chaeckIndex(arr) ? "True" : "False");
    }
}
