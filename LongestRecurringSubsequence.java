public class LongestRecurringSubsequence {
    public static int recurrence(String s,int m,int n)
    {
        if(m==0 || n==0)
        return 0;
        if((s.charAt(m-1) == s.charAt(n-1)) && m!=n)
        {
            return recurrence(s,m-1,n)+1;
        }
        return Integer.max(recurrence(s, m, n-1),recurrence(s, m-1, n));
    }
    public static void main(String args[])
    {
        String s = "axxxy";
        int n = s.length();
        System.out.println(recurrence(s, n, n));
    }
}
