

// Java implementation of the above approach 
  
import java.util.*; 
  
public class GfG { 
    private static String remainingDigit(String S, int N) 
    { 
        // Converting string to array 
        char c[] = S.toCharArray(); 
  
        // Delete counters for each to 
        // count the deletes 
        int del[] = { 0, 0 }; 
  
        // Counters to keep track 
        // of characters left from each type 
        int count[] = { 0, 0 }; 
  
        // Queue to simulate the process 
        Queue<Integer> q = new LinkedList<>(); 
  
        // Initializing the queue 
        for (int i = 0; i < N; i++) { 
            int x = c[i] == '1' ? 1 : 0; 
            count[x]++; 
            q.add(x); 
        } 
  
        // Looping till at least 1 digit is 
        // left from both the type 
        while (count[0] > 0 && count[1] > 0) { 
            int t = q.poll(); 
  
            // If there is a floating delete for 
            // current character we will 
            // delete it and move forward otherwise 
            // we will increase delete counter for 
            // opposite digit 
            if (del[t] > 0) { 
                del[t]--; 
                count[t]--; 
            } 
            else { 
                del[t ^ 1]++; 
                q.add(t); 
            } 
        } 
  
        // If 0 are left 
        // then answer is 0 else 
        // answer is 1 
        if (count[0] > 0) 
            return "0"; 
        return "1"; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        // Input String 
        String S = "1010100100000"; 
  
        // Length of String 
        int N = S.length(); 
  
        // Printing answer 
        System.out.print(remainingDigit(S, N)); 
    } 
} 

