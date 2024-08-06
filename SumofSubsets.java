public class SumofSubsets {

    public static void sumOfSubsets(int[] array, int targetSum) {
        sumOfSubsets(array, targetSum, 0, 0, "");
    }

    private static void sumOfSubsets(int[] array, int targetSum, int index, int currentSum, String currentSubset) {
        if (index == array.length) {
            if (currentSum == targetSum) {
                System.out.println("Subset: " + currentSubset + ", Sum: " + currentSum);   
            }
            return;
        }
        sumOfSubsets(array, targetSum, index + 1, currentSum + array[index], currentSubset + array[index] + " ");
        sumOfSubsets(array, targetSum, index + 1, currentSum, currentSubset);
    }

    public static void main(String[] args) {
        int[] array = { 5,10,12,13,15,18 };
        int targetSum = 30;
        sumOfSubsets(array, targetSum);
    }
}


