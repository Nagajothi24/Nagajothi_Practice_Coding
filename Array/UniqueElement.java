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
        boolean flag=false;
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
     
        for(int i=0;i<size;i++){
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) continue;
               int count=0;
            for(int j=0;j<size;j++){
                if(a[i]==a[j])
                    count++;
            }
            if(count==1){
                System.out.print(a[i]+" ");
                flag=true;
            }
                
        }
        if(!flag)
            System.out.println("No unique elements in the array");
            
    } 
}
