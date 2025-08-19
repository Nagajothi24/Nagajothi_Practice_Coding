import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int find=in.nextInt();
        int count=0;
        
        while(num>0){
            int n1=num%10;
             num=num/10;
            if(n1==find){
                count++;
            }
           
        }
         System.out.println(count);
    }
}
