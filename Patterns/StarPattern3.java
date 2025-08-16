
// Sample Input :

// 5

// Sample Output :

//     *****
//    *****
//   *****
//  *****
// *****



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
