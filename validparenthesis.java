import java.util.*;
public class validparenthesis {
    public static void main(String args[])
    {
        Scanner sr = new Scanner(System.in);
        int n  = sr.nextInt();
        char[] ar = new char[n*2];
        balPara(ar,n,0,0,0);
    }
    public static void balPara(char[] ar,int n,int i,int o,int c)
    {
        if(i==ar.length)
        System.out.println(ar);

        if(o<n)
        {
            ar[i] = '(';
            balPara(ar,n,i+1,o+1,c);
        }

        if(c<o)
        {
            ar[i] = ')';
            balPara(ar,n,i+1,o,c+1);
        }
    }
}
