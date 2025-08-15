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
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        System.out.print(a[0]*a[1]+" ");
        for(int i=1;i<size-1;i++){
            System.out.print(a[i-1]*a[i+1]+" ");
        }
        System.out.print(a[size-1]*a[size-2]+" ");
    }
}
