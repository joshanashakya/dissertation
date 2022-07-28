

// Java implementation of the approach 
  
import java.util.*; 
import java.util.concurrent.ConcurrentHashMap; 
  
class GFG{ 
   
// Function to return the minimum cost required 
static int getMinCost(int arr[], int n, int cost[]) 
{ 
   
    // Map to store <gcd, cost> pair where 
    // cost is the cost to get the current gcd 
    Map<Integer,Integer> mp = new ConcurrentHashMap<Integer,Integer>(); 
    mp.clear(); 
    mp.put(0, 0); 
   
    for (int i = 0; i < n; i++) { 
        for (Map.Entry<Integer,Integer> it : mp.entrySet()){ 
            int gcd = __gcd(arr[i], it.getKey()); 
   
            // If current gcd value already exists in map 
            if (mp.containsKey(gcd)) 
   
                // Update the minimum cost 
                // to get the current gcd 
                mp.put(gcd, Math.min(mp.get(gcd), it.getValue() + cost[i])); 
   
            else
                mp.put(gcd,it.getValue() + cost[i]); 
        } 
    } 
   
    // If there can be no sub-set such that 
    // the gcd of all the elements is 1 
    if (!mp.containsKey(1)) 
        return -1; 
    else
        return mp.get(1); 
} 
static int __gcd(int a, int b)   
{   
    return b == 0? a:__gcd(b, a % b);      
}  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 10, 12, 1 }; 
    int cost[] = { 2, 1, 2, 6 }; 
    int n = arr.length; 
   
    System.out.print(getMinCost(arr, n, cost)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

