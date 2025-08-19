import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original = n;
        int sq = original * original;

        int rev = 0, ld;
        while (n > 0) {
            ld = n % 10;
            n = n / 10;
            rev = rev * 10 + ld;
        }
        int sq_rev = rev * rev;

        int ans = 0, ld1;
        int temp = sq_rev;
        while (temp > 0) {
            ld1 = temp % 10;
            temp = temp / 10;
            ans = ans * 10 + ld1;  
        }

        if (sq == ans)
            System.out.println("Adam Number");
        else
            System.out.println("Not a adam number");
    
        
    }
}
