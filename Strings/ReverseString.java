import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myString=in.nextLine();
        char[] charArray=myString.toCharArray();
        
        for(int i=myString.length()-1;i>=0;i--){
             char c=myString.charAt(i);
            System.out.print(c);
        }
        
        
    }
}
