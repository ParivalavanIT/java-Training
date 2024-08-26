import java.util.Scanner;

public class AddingtwoStringsalternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i += 2) {
            sb.append(str1.charAt(i));
            if (i + 1 < str2.length()) {
                sb.append(str2.charAt(i + 1));
            }
        }

        System.out.println(sb.toString());
    }
}