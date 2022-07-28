

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static int N = 2005; 
  
static Set<Integer> ans = new LinkedHashSet<Integer>(); 
  
// Recursively moving to add 
// all the numbers upto a limit 
// with sum of digits as m 
static void dfs(int num, int left, int ct) 
{ 
    // Max number of digits allowed in 
    // a number for this implementation 
    if (ct >= 15) 
        return; 
    if (left == 0) 
        ans.add(num); 
    for (int i = 0; i <= Math.min(left, 9); i++) 
        dfs(num * 10 + i, left - i, ct + 1); 
} 
  
// Function to return the kth number 
// with sum of digits as m 
static int getKthNum(int m, int k) 
{ 
    dfs(0, m, 0); 
  
    int ct = 0; 
    for (int it : ans)  
    { 
        ct++; 
  
        // The kth smallest number is found 
        if (ct == k)  
        { 
            return it; 
        } 
    } 
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int m = 5, k = 3; 
  
    System.out.println(getKthNum(m, k)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

