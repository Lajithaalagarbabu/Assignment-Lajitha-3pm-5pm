import java.util.*;
class CountAlphabet {
    public static void main(String[] args) {
        String s = "aaabbccccd";
        char temp=s.charAt(0);
        int count=1;
        for(int i=1;i< s.length();i++){
            if(s.charAt(i)==temp)
            {
                count++;
            }
            else{
                System.out.println(temp+" "+count);
                temp=s.charAt(i);
                count=1;
            }
        }
        
        System.out.print(temp+" "+count);
    }
}