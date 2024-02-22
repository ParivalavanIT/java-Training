import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number coressponding to day");
        int day = sc.nextInt();

        switch(day){
           case 1:{
            System.out.println("Sunday");
            break;
           }
           case 2:{
            System.out.println("Monday");
            break;
           }
           case 3:{
           System.out.println("Tuesday");
           break;
           }
           case 4:{
           System.out.println("Wednesday");
           break;
           }
           case 5:{
           System.out.println("Thursday");
           break;
           }
           case 6:{
           System.out.println("Friday");
           break;
           }
           case 7:{
           System.out.println("Saturday");
           break;
           }
           default:{
           System.out.println("Invalid day");
           }
        }
        int choice =sc.nextInt();

        switch(choice){
            default:
                {
                    if(choice<=5){
                        System.out.printf("User selected no %d", choice);
                    }
                    else{
                        System.out.println("Enter between 1 to 5");
                    }
                    break;
                }
            
        }
    sc.close();

    }
}
