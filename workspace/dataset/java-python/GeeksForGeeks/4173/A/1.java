

// Java implementation of above approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function to return required  
// array of distances  
static void shortestDistance(String S, char X)  
{  
  
    // Find distance from occurrences of X  
    // appearing before current character.  
    int prev = Integer.MAX_VALUE;  
    Vector<Integer> ans = new Vector<>();  
      
    for (int i = 0; i < S.length(); i++)  
    {  
        if (S.charAt(i) == X)  
            prev = i;  
        ans.add(i - prev);  
    }  
  
    // Find distance from occurrences of X  
    // appearing after current character and  
    // compare this distance with earlier.  
    prev = Integer.MAX_VALUE; 
    for (int i = S.length() - 1; i >= 0; i--)  
    {  
        if (S.charAt(i) == X)  
            prev = i;  
              
        ans.set(i, Math.min(ans.get(i), prev - i));  
    }  
  
    for (Integer val: ans)  
            System.out.print(val+" "); 
}  
  
// Driver code  
public static void main(String[] args) 
{ 
    String S = "geeksforgeeks";  
    char X = 'g';  
    shortestDistance(S, X); 
} 
} 
  
// This code is contributed by Rajput-Ji 

