

// Java  program to find length of longest consecutive 
// ones by at most one swap in a Binary String 
  
import java.io.*; 
  
class GFG { 
   
// Function to calculate the length of the 
// longest consecutive 1's 
 static int maximum_one(String s, int n) 
{ 
    // To count all 1's in the string 
    int cnt_one = 0; 
  
    int max_cnt = 0, temp=0; 
  
    for (int i = 0; i < n; i++) { 
        if (s.charAt(i) == '1') 
        { 
            cnt_one++; 
            temp++; 
        } 
        else
        { 
            max_cnt = Math.max(max_cnt, temp); 
            temp = 0; 
        } 
    } 
    max_cnt = Math.max(max_cnt, temp); 
  
    // To store cumulative 1's 
    int []left = new int[n]; 
     int right[]= new int[n]; 
  
    if (s.charAt(0) == '1') 
        left[0] = 1; 
    else
        left[0] = 0; 
  
    if (s.charAt(n - 1) == '1') 
        right[n - 1] = 1; 
    else
        right[n - 1] = 0; 
  
    // Counting cumulative 1's from left 
    for (int i = 1; i < n; i++) { 
        if (s.charAt(i) == '1') 
            left[i] = left[i - 1] + 1; 
  
        // If 0 then start new cumulative 
        // one from that i 
        else
            left[i] = 0; 
    } 
  
    for (int i = n - 2; i >= 0; i--) { 
        if (s.charAt(i) == '1') 
            right[i] = right[i + 1] + 1; 
  
        else
            right[i] = 0; 
    } 
  
  
    for (int i = 1; i < n - 1; i++) { 
        // perform step 3 of the approach 
        if (s.charAt(i) == '0') { 
  
            // step 3 
            int sum = left[i - 1] + right[i + 1]; 
  
            if (sum < cnt_one) 
                 max_cnt = Math.max(max_cnt, sum+1); 
  
            else
                 max_cnt = Math.max(max_cnt, sum); 
        } 
    } 
  
    return max_cnt; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
        // string 
    String s = "111011101"; 
  
    System.out.println( maximum_one(s, s.length())); 
    } 
} 
// This code is contributed by anuj_67.. 

