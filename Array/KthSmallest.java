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
        int k=in.nextInt();
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
          for(int i=0;i<size-1;i++){
              for(int j=0;j<size-i-1;j++){
                  if(a[j]>a[j+1]){
                      int temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
            
                  }
              }
             
              }
          
     if(k<size){
                  System.out.println(a[k-1]);
              }
              else{
                  System.out.println("Out of Range");
              }
    }
}
