

// Java program to implement the above 
// approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to maximize the number of pairs 
static int findMaximumPairs(int a[], int n, int k) 
{ 
  
    // Hash-table 
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
    for (int i = 0; i < n; i++) 
        if(hash.containsKey(a[i] % k)){ 
            hash.put(a[i] % k, hash.get(a[i] % k)+1); 
        } 
        else{ 
            hash.put(a[i] % k, 1); 
        } 
  
    int count = 0; 
  
    // Iterate for all numbers less than hash values 
    for (Map.Entry<Integer,Integer> it : hash.entrySet()){ 
  
        // If the number is 0 
        if (it.getKey() == 0) { 
  
            // We take half since same number 
            count += it.getValue() / 2; 
            if (it.getKey() % 2 == 0) 
                hash.put(it.getKey(), 0); 
            else
                hash.put(it.getKey(), 1); 
        } 
        else { 
  
            int first = it.getKey(); 
            int second = k - it.getKey(); 
  
            // Check for minimal occurrence 
            if (hash.get(first) < hash.get(second))  
            { 
                  
                // Take the minimal 
                count += hash.get(first); 
  
                // Subtract the pairs used 
                hash.put(second, hash.get(second)-hash.get(first)); 
                hash.put(first, 0); 
            } 
            else if (hash.get(first) > hash.get(second)) 
            { 
                  
                // Take the minimal 
                count += hash.get(second); 
  
                // Subtract the pairs used 
                hash.put(first, hash.get(first)-hash.get(second)); 
                hash.put(second, 0); 
            } 
            else 
            { 
                // Check if numbers are same 
                if (first == second) { 
  
                    // If same then number of pairs will be half 
                    count += it.getValue() / 2; 
  
                    // Check for remaining 
                    if (it.getKey() % 2 == 0) 
                        hash.put(it.getKey(), 0); 
                    else
                        hash.put(it.getKey(), 1); 
                } 
                else { 
  
                    // Store the number of pairs 
                    count += hash.get(first); 
                    hash.put(first, 0); 
                    hash.put(second, 0); 
                } 
            } 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 2, 3, 2, 4, 10 }; 
    int n = a.length; 
    int k = 2; 
    System.out.print(findMaximumPairs(a, n, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

