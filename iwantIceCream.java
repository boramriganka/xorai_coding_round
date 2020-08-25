import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'combos' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING flavors as parameter.
*/

    public static int combos(String flavors) {
        char [] chars = flavors.toCharArray(); 
        HashSet<Character> unique = new HashSet<Character>(); 
        for (char s : chars) { 
            unique.add(s); 
        } 
      int n = unique.size();
      int result = n*(n-1) /2;
      return result;
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String flavors = bufferedReader.readLine();

        int result = Result.combos(flavors);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
