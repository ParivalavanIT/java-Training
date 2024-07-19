import java.util.Scanner;
public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  the number");
        int num = sc.nextInt();

        int ans=0;

        for(int i = 1;i<=num;i++){
            if(num%i==0){
                ans = ans+i;
            }
        }

        System.out.println(ans);
    }
}
