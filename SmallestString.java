import java.util.Scanner;

public class SmallestString {

    public static int[] computeWeights() {
        int[] weights = new int[26];
        weights[0] = 1;
        for (int i = 1; i < 26; i++) {
            weights[i] = (i + 1) * weights[i - 1] + weights[i - 1];
        }
        return weights;
    }

    public static String shortestString(int weight) {
        int[] weights = computeWeights();
        StringBuilder result = new StringBuilder();

        for (int i = 25; i >= 0; i--) {
            if (weight >= weights[i]) {
                int count = weight / weights[i];
                for (int j = 0; j < count; j++) {
                    result.append((char) ('A' + i));
                }
                weight %= weights[i];
            }
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(shortestString(a));
    }
}