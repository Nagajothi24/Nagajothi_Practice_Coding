// Sample Input :

// 4 

// Sample Output "

// *******
// **   **
// * * * *
// *  *  *
// * * * *
// **   **
// *******




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int size=2*n-1;
        for(int row=1;row<=size;row++){
            for(int col=1;col<=size;col++){
                if(row==col || row==1 || row==size ||col==1 || col==size || row+col==size+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                }
            System.out.println();
        }
    }
}
