import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int ans=(int)Math.sqrt(num);
        if(ans*ans==num){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not");
        }
    }
}
