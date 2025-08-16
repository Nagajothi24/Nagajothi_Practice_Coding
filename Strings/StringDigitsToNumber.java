import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
       
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c))
               { System.out.print(c);
                flag=1;
            }

            }
        if(flag==0){
            System.out.print(0);
        }
    }
}
