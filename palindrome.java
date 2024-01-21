import java.util.*;
public class palindrome {
    public static boolean ispalindrome(String s,int i,int j)
    {
        if(s.charAt(i) != s.charAt(j))
        {
            return false;
        }
        if( j <= i) 
        {
            return true;
        }
        return ispalindrome(s, i+1, j-1);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        System.out.println(ispalindrome(s1, 0, s1.length()-1));
    }
}
