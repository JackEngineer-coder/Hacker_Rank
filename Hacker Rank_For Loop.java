import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=1; i<=10; i++)
        {
            int c= N*i;
            System.out.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(c);
            
        }
    }
}
