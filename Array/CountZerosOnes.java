import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        int zcount=0,ocount=0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]==0){
                zcount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("zc = "+zcount);
        System.out.println("oc = "+ocount);
    }
}
