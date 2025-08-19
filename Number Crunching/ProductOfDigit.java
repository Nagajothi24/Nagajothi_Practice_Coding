import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p;
        int mul=1;
        while(n>0){
            p=n%10;
            mul=mul*p;
            n/=10;
            
        }
        System.out.println(mul);
    }
}
