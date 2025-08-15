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
        int max=0;
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]>a[j]){
                    max=a[i];
                }
            }
             
        }
        
       
        for(int i=0;i<size;i++){
            if(a[i]>max){
                max=a[i];
            }
            }
        
        System.out.println(max);
    
    }
}
