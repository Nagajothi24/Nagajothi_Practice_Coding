import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        while(n2!=0){
            int temp=n1%n2;
            n1=n2;
            n2=temp;
            if(n2==0)
                System.out.println("GCD of two number is "+n1);
        }
    }
}
