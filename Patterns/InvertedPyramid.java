// Sample Input :

// 4
  
// Sample Output :

// *******
//  *****
//   ***
//    *
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * (n - row) - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
}
