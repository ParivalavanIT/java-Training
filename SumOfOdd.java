import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int ans = 0;

        for(int i=1;i<=a;i=i+2){
            ans = ans+i;
        }
        
        System.out.println(ans);
    }
}
