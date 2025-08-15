import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        int k=in.nextInt();
        for(int count=1;count<=k%size;count++){
            int copy=a[size-1];
            for(int i=size-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=copy;
        }
          for(int j=0;j<size;j++){
        System.out.print(a[j]+" ");
    }
        System.out.println();
    }
  
   
}
