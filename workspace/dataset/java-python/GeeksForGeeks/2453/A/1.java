

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
} 
// Function to perform BFS traversal to 
// find minimum number of step needed 
// to reach x from K 
static int minStepsNeeded(int k, int d1,  
                          int d2, int x) 
{ 
    // Calculate GCD of d1 and d2 
    int gcd = __gcd(d1, d2); 
  
    // If position is not reachable 
    // return -1 
    if ((k - x) % gcd != 0) 
        return -1; 
  
    // Queue for BFS 
    Queue<pair> q = new LinkedList<>(); 
  
    // Hash Table for marking 
    // visited positions 
    HashSet<Integer> visited = new HashSet<>(); 
  
    // we need 0 steps to reach K 
    q.add(new pair(k, 0 )); 
  
    // Mark starting position 
    // as visited 
    visited.add(k); 
  
    while (!q.isEmpty())  
    { 
        int s = q.peek().first; 
  
        // stp is the number of steps 
        // to reach position s 
        int stp = q.peek().second; 
  
        if (s == x) 
            return stp; 
  
        q.remove(); 
  
        if (!visited.contains(s + d1))  
        { 
  
            // if position not visited 
            // add to queue and mark visited 
            q.add(new pair(s + d1, stp + 1)); 
  
            visited.add(s + d1); 
        } 
  
        if (visited.contains(s + d2))  
        { 
            q.add(new pair(s + d2, stp + 1)); 
            visited.add(s + d2); 
        } 
  
        if (!visited.contains(s - d1)) 
        { 
            q.add(new pair(s - d1, stp + 1)); 
            visited.add(s - d1); 
        } 
        if (!visited.contains(s - d2))  
        { 
            q.add(new pair(s - d2, stp + 1)); 
            visited.add(s - d2); 
        } 
    } 
    return Integer.MIN_VALUE; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int k = 10, d1 = 4, d2 = 6, x = 8; 
  
    System.out.println(minStepsNeeded(k, d1, d2, x)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

