import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char check=in.nextLine().charAt(0);
        String s=in.nextLine();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(check==c){
                flag=true;
                break;
            }
            
        }
        if(flag==true)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
