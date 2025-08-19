import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
        int n,sum=0,fact =1 ,ld;
        n = sc.nextInt();  // 14       5 
        int copy = n;
        while(n>0)
        {
            ld = n% 10;
            n = n /10;
            fact = 1;
            for(int i=1 ; i<=ld ; i++)
            {
                fact = fact * i;
                    //System.out.print(fact + " ");
            }
            sum = sum + fact;
                //System.out.println(sum+ " + ");
        }
        if(copy == sum)
        System.out.println("Strong Number");
        else 
        System.out.println("Not a strong number");
    }
}
