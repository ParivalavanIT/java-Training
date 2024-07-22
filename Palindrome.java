public class Palindrome {
    public static Boolean isPalindrome(String palindrome,int i,int j){
        if(i>=j){
            return true;
        }
        if(palindrome.charAt(i)==palindrome.charAt(j)){
            return isPalindrome(palindrome,++i,--j);
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        if(isPalindrome("pari",0,3)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
