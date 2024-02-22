import java.util.Scanner;

public class EverOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("the given number is even number");
        }else{
            System.out.println("The given number is odd number");
        }
    }
}
