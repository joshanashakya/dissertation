

// Java program to solve the above problem  
import java.util.Arrays; 
  
class GFG  
{ 
  
    // Recursive function to find minimum number  
    // of cuts if length of String is even  
    static int solveEven(String s) 
    { 
        // If length is odd then return 2  
        if (s.length() % 2 == 1) 
        { 
            return 2; 
        } 
  
        // To check if half of palindromic String  
        // is itself a palindrome  
        String ls = s.substring(0, s.length() / 2); 
  
        String rs = s.substring(s.length() / 2, s.length()); 
  
        // If not then return 1  
        if (ls != rs) 
        { 
            return 1; 
        } 
  
        // Else call function with half palindromic String  
        return solveEven(ls); 
    } 
  
    // Function to find minimum number of cuts  
    // If length of String is odd  
    static int solveOdd(String s)  
    { 
        return 2; 
    } 
  
    static int solve(String s) 
    { 
        // If length is <=3 then it is impossible  
        if (s.length() <= 3)  
        { 
            return -1; 
        } 
  
        // Array to store frequency of characters  
        int cnt[] = new int[25]; 
  
        // Store count of characters in a array  
        for (int i = 0; i < s.length(); i++)  
        { 
            cnt[s.charAt(i) - 'a']++; 
        } 
  
        // Condition for edge cases  
        if (Arrays.stream(cnt).max().getAsInt() >= s.length() - 1) 
        { 
            return -1; 
        } 
  
        // If length is even  
        if (s.length() % 2 == 0)  
        { 
            return solveEven(s); 
        } 
  
        // If length is odd  
        if (s.length() % 2 == 1)  
        { 
            return solveOdd(s); 
        } 
        return Integer.MIN_VALUE; 
    } 
  
    // Driver Code  
    public static void main(String[] args)  
    { 
        String s = "nolon"; 
        System.out.println(solve(s)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

