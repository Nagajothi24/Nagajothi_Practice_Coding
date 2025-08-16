import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        int special=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='@' || c=='#' || c=='$' || c=='%' ||c=='^' || c=='&' ||c=='*' ||c=='!' ||c=='?'  ||c=='/'){
                special++;
            }
        }
        System.out.println(special);
    }
}
