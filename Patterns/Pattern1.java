// Sample Input :

// 5

// Sample Output :

// 10101
// 01010
// 10101
// 01010
// 10101
**********************************
// Sample Input :

// 6
  
// Sample Output :

// 101010
// 010101
// 101010
// 010101
// 101010
// 010101





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                // if((row+col)%2==0){
                if(row%2==col%2){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
