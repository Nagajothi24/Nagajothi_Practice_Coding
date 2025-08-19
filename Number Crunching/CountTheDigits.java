import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        long n,count=0;
        n=sc.nextLong();
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
