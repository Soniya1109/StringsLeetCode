import java.util.*;
public class vowelsConsonant {
    public static void main(String args[])
    {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sr.nextLine();
        VowelConsonant(s);
    }
    public static void VowelConsonant(String s)
    {
        int vowels = 0;
        int consonant = 0;
        
        char[] ch = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i =0;i<s.length();i++)
        {
            boolean isVowel = false;
            for(int j =0;j<ch.length;j++)
            {
                if(s.charAt(i) == ch[j])
                {
                    vowels++;
                    isVowel = true;
                    break;
                }
            }

            if(!isVowel && s.charAt(i) != ' ')
            {
                consonant++;
            }

            
        }
        System.out.println("Vowels are " + vowels);
        System.out.println("Consonants are " + consonant);
    }
}
