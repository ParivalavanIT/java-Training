public class WhileEvenOrOdd {
    public static boolean evenOrOdd(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // With while loop
        int a = 1;
        while(a<=5){
            if(evenOrOdd(a)){
                System.out.printf("%d is even\n",a);
            }else{
                System.out.printf("%d is odd\n",a);
            }
            a++;
        }
        // With do while loop
        int b=10;
        do{
           if(!evenOrOdd(b)) {
             System.out.printf("%d is odd number\n",b);
           }
           b++;
        }while(b<=20);
    }
}
