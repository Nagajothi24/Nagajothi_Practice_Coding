// Sample Input :

// 5

// Sample Output :

// 1
// 24
// 135
// 2468
// 13579

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int val;
        for(int row=1;row<=n;row++){
            if(row%2==0)
                val=2;
            else
                val=1;
            for(int col=1;col<=row;col++){
                System.out.print(val);
                val=val+2;
            }
            System.out.println();
        }
        
       
        
    }
}
