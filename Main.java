import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=10 , b=20 , c=30;

        // Ternary operator
        char max = ((a>b)&&(a>c))?'a':((b>c)?'b':'c');
        int maxNum = ((a>b)&&(a>c))?a:((b>c)?b:c);
        System.out.printf("\"%c\" is the greater number and the number is %d\n",max,maxNum);

        //Switch case
        switch(max){
            case 'a':
            {
                System.out.printf("a is the greater number and the number is %d\n",maxNum);
                break;
            }
            case 'b':
            {
                System.out.printf("b is the greater number and the number is %d\n",maxNum);
                break;
            }
            case 'c':
            {
                System.out.printf("c is the greater number and the number is %d\n",maxNum);
                break;
            }
            default:
            {
                System.out.println("Onnumae illa da");
                break;
            }
        }

        //only if
        if(a>b){
            System.out.print(a);
        }

        //if and else
        if(a>b){
            System.out.print(a);
        }else{
            System.out.print(b);
        }

        //if else if - ladder
        if((a>b) && (a>c)){
            System.out.printf("a is the greater number and the number is %d\n",maxNum);
        }
        else if(b>c){
            System.out.printf("b is the greater number and the number is %d\n",maxNum);
        }
        else{
            System.out.printf("c is the greater number and the number is %d\n",maxNum);
        }


        if(System.out.printf("Parivalavan")==null){}
    }
}
