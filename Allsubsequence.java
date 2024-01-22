import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Allsubsequence {
    
    public static void main(String args[])
    {
        String a = "abc";
        findsequence(a,"");

    }
    static void findsequence(String s,String ans)
    {
        if(s.length() == 0)
        {
        System.out.println(ans);
        return;
        }
    
    findsequence(s.substring(1),ans+s.charAt(0));
    findsequence(s.substring(1), ans);
    }
}
