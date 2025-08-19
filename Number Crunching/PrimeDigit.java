import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);
        long rev=0,ld;
        long n = in.nextLong();
        long copy=n;
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
            }
         while(rev>0){
             long num=rev%10;
             
             if(num==2 || num==3 || num==5 || num==7){
              System.out.print(num+" ");
                
            }
             rev=rev/10;
         } }
}
