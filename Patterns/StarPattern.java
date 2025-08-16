// Sample Input :

// 4

// Sample Output :

// *
// **
// ***
// ****

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
    Scanner in=new Scanner(System.in);
        int n =in.nextInt();
      
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
