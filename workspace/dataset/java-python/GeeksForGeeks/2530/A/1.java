

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function to return the minimum number of 
    // pre-processing moves required on string A 
    static int Preprocess(String A, String B) 
    { 
        // Length of the given strings 
        int n = A.length(); 
      
        // To store the required answer 
        int ans = 0; 
      
        // Run a loop upto n/2 
        for (int i = 0; i < n / 2; i++)  
        { 
      
            // To store frequency of 4 characters 
              
            HashMap<Character, Integer> mp = new HashMap<>(); 
              
            if(mp.containsKey(A.charAt(i))) 
                mp.put(A.charAt(i), mp.get(A.charAt(i))+1); 
            else
            mp.put(A.charAt(i), 1); 
              
            if(mp.containsKey(A.charAt(n-i-1)))  
                mp.put(A.charAt(n-i-1), mp.get(A.charAt(n-i-1))+1); 
            else
            mp.put(A.charAt(n-i-1), 1); 
              
            if(mp.containsKey(B.charAt(i))) 
                mp.put(B.charAt(i), mp.get(B.charAt(i))+1); 
            else
            mp.put(B.charAt(i), 1); 
          
            if(mp.containsKey(B.charAt(n-i-1)))  
                mp.put(B.charAt(n-i-1), mp.get(B.charAt(n-i-1))+1); 
            else
            mp.put(B.charAt(n-i-1), 1); 
          
            int sz = mp.size(); 
      
            // If size is 4 
            if (sz == 4) 
                ans += 2; 
      
            // If size is 3 
            else if (sz == 3) 
                ans += 1 + (A.charAt(i) == A.charAt(n - i - 1) ? 1 : 0 ); 
      
            // If size is 2 
            else if (sz == 2) 
                ans += mp.get(A.charAt(i)) != 2 ? 1 : 0; 
        } 
      
        // If n is odd 
        if (n % 2 == 1 && A.charAt(n / 2) != B.charAt(n / 2)) 
            ans++; 
      
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        String A = "abacaba", B = "bacabaa"; 
        System.out.println(Preprocess(A, B)); 
      
    } 
  
} 
  
// This code is contributed by ihritik 

