import java.util.Scanner;

class EvenWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");

        // method 1

        int number=sc.nextInt();
        int vari;

        vari=number/2;
        
        if(number==vari*2){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
        }

        // method 2
        
        if((number & 1)==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is odd");
         }
    }
}