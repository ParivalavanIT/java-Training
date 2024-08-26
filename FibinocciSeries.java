import java.util.Scanner;

public class FibinocciSeries {
    static int fib(int n ){
        if(n==0|| n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static int fibWithoutRec(int n){
        int a=0,b=1,c=0;
        if(n==0||n==1){
            return n;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
