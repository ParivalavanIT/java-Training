import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%5!=0){
                System.out.printf("%2d ",i);
                i++;
            }else{
                System.out.printf("%d \n", i);
                i++;
            }
        }
        sc.close();
    }
}
