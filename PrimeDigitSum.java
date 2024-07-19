import java.util.Scanner;

public class PrimeDigitSum {

    public static Boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        return (count==0);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            sum = sum + n % 10;
            n=n/10;
        }
        
        System.out.println("sum of the number is "+ sum);

        if(isPrime(sum)){
            System.out.println(sum+" is a prime number");
        }else{
            System.out.println(sum+" is not a prime number");
        }
    }
}
