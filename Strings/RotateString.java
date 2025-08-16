import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        in.nextLine();
        String a = in.nextLine();
        int l=a.length();
        int n=k%l;
        String ch=a.substring(n)+a.substring(0,n);
        System.out.println(ch);
    }
}
