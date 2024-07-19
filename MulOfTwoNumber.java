import java.util.Scanner;

public class MulOfTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int a = sc.nextInt();

        System.out.print("Enter the Second number");
        int b = sc.nextInt();

        int c = 0;

        for(int i=0;i<b;i++){
            c = c + a ;
        }

        System.out.println("The product of two numbers is: " + c);
    }
}
