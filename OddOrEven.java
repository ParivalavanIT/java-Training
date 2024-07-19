import java.util.Scanner;
class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if( (num & 1)==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}