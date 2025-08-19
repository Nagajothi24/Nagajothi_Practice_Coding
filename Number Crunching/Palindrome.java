import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long copy=n;
        long rev=0;
        long ld;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }
    
    if(copy==rev)
            System.out.println("Palindrome");
    else 
        System.out.println("Not a Palindrome");
    }
    
}
