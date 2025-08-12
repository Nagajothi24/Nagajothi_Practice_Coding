import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=2,count=0;
        int pf=0;
        while(n>1){
            if(n%i==0){
                count++;
                n=n/i;
                pf=i;
            }
            else{
                
                count=0;
                i++;
                continue;
            }
           
        }
        System.out.println(pf);
         
    }
}
