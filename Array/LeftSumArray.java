import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int []a=new int[size];
        int sum=0;
        System.out.print(sum+" ");
        for(int i=0;i<size-1;i++){
            
            a[i]=in.nextInt();
            sum=sum+a[i];
            System.out.print(sum+" ");
            
        }
    }
}
