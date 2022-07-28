

// An efficient approach based implementation 
// to find if a number can be written as sum 
// of two squares. 
import java.util.*; 
class GFG  
{ 
  
// function to check if there exist two 
// numbers sum of whose squares is n. 
static boolean sumSquare(int n) 
{ 
    HashMap<Integer, 
            Integer> s = new HashMap<Integer, 
                                     Integer>(); 
    for (int i = 0; i * i <= n; ++i) 
    { 
  
        // store square value in hashmap 
        s.put(i * i, 1); 
        if (s.containsKey(n - i * i))  
        { 
            System.out.println((int)Math.sqrt(n - i * i) +  
                                      "^2 + " + i + "^2"); 
            return true; 
        } 
    } 
    return false; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 169; 
    System.out.print(sumSquare(n) ? 
                          "YES\n" : "NO\n"); 
} 
} 
  
// This code is contributed by Princi Singh 

