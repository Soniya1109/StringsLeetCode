public class Binaryto2substring {
    public static void main(String args[])
    {
        String s = "0100110101";
        System.out.println(binarytosubstring(s));
    }
    public static int binarytosubstring(String s)
    {
        int x =0,y=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '0')
            x++;
            else
            y++;

            if(x==y)
            c++;

        }
        if(x!=y)
        {
         return -1;
        }
        return c;

    }
}
