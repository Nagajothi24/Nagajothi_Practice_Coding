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
        int flag=0;
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        int element=in.nextInt();
        for(int i=0;i<size;i++){
            if(a[i]==element){
                flag=1;
            }
        }
        if(flag==1)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
