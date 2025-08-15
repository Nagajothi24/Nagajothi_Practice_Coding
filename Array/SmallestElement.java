import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int a[]=new int[size];
        int min=0;
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]<a[j]){
                    min=a[i];
                }
            }
             
        }
        
      
        for(int i=0;i<size;i++){
            if(a[i]<min){
                min=a[i];
            }
            }
        
        System.out.println(min);
    }
}
