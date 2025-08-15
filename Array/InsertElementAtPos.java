import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] a= new int[size+1];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        int data=in.nextInt();
        int pos=in.nextInt();
        for(int i=size;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=data;
        for(int i=0;i<size+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
