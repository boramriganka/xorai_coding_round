import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0,neutral = 0;
            for(int j = 0 ; j < n; j++){
                if(arr[j] > 0){
                  if(arr[j] % 5 == 0 || arr[j] % 5 == 3){
                    count++;
                  } else if(arr[j] <= 0){
                      neutral++;
                  } 
                }
                int bob_win = count;
                int games_with_results = n - neutral;
            }
            System.out.println("Bob wins in the game " +count+" times.");
            System.out.println("Bob loses in the game " +(games_with_results-count)+" times.");
        }
    }
}
