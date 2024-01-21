import java.util.*;
import java.util.Arrays;
import java.util.SortedSet;
public class ValidShuffle {
    public static boolean shuffle(String s1,String s2,String res)
    {
        int n = s1.length();
        int m = s2.length();
        if((n+m) != res.length())
        {
            return false;
        }
        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);

        int i =0,j=0,k=0;

        while(k<res.length())
        {
            if(i<n && (s1.charAt(i) == res.charAt(k)))
            i++;
            else if(j<m && (s2.charAt(j) == res.charAt(k)))
            j++;
            else
            {
                return false;
                
            }
            k++;
        }

        return (i>= n && j>=m );

    }
    public static String sort(String ca)
    {
        char[] ss = ca.toCharArray();
        Arrays.sort(ss);
        return String.valueOf(ss);
    }
    public static void main(String args[])
    {
        String s1 = "pqr";
        String s2 = "123";
        String res = "p1q2r3";
        if(shuffle(s1,s2,res))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
