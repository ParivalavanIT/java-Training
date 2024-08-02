import java.util.Arrays;
import java.util.Scanner;
public class GameSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = sc.nextLine();
        String[] inputArray = inputString.split(" ");
        
        String longestOddString = "";
        int maxLength = 0;

        for(String st :inputArray){
            if(st.length() %2!=0 && st.length()>maxLength){
                maxLength = st.length();
                longestOddString=st;
            }
        }

        if(maxLength == 0){
            System.out.println("Better luck next time");
        }else{
            System.out.println("Longest odd string is: "+longestOddString);
        }
}
}


