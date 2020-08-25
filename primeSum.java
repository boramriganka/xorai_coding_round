import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   static boolean prime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
}
      
    static boolean sumofprimes(long N, long K) 
    { 
        if (N < 2*K) 
            return false; 
          
        // only depends on N ,only one number
        if (K == 1) 
            return prime(N); 
              
        if (K == 2) 
        { 
            if (N%2 == 0) {
                return true; 
            }    
            return prime(N - 2); 
        } 
        return true; 

    }
    // Complete the solve function below.
    static String solve(long n, long k) {
        String result = "";
        if(sumofprimes(n,k)){
            result = "Yes";
        }
        else{
            result = "No";
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            long n = Long.parseLong(nk[0]);

            long k = Long.parseLong(nk[1]);

            String result = solve(n, k);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
