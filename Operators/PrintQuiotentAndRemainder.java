import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        float n1=in.nextFloat();
        float n2=in.nextFloat();
        float q=(float)(n1/n2);
        float r=(float)(n1%n2);
        System.out.print((int)n1+" / "+(int)n2+" = ");
        System.out.printf("%.6f\n",q);
        System.out.println((int)n1+" % "+(int)n2+" = "+(int)r);
    }
}
