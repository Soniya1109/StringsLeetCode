import java.util.*;
public class reversestring
{
    public static String reverse(String s,String r,int i)
    {
        if(i<0)
        {
        return r;
        }
        return reverse(s,r+s.charAt(i),i-1);

    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String d = reverse(s1,"",s1.length()-1);
        System.out.println(d);
    }
}