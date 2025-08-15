import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] a=new int[size];
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<size;i++){
            if(a[i]%2!=0){
                oddCount++;
            }
            else{
                evenCount++;
            }
        }
        System.out.println("Odd = "+oddCount);
        System.out.println("Even = "+evenCount);
        
    }
}
