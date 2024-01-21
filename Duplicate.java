public class Duplicate {
    public static void main(String args[])
    {
        String str = "soanniyataj";
        System.out.println(str);

        int count = 0;
        char[] ch = str.toCharArray();
        for(int i = 0;i<str.length()-1;i++)
        {
            for(int j = i+1;j<str.length();j++)
            {
                if(ch[i] == ch[j])
                {
                   System.out.println(ch[j]);
                   count++;
                   break;
                }
            }
        }

    }
}
