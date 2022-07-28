

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the required triplets 
static void findTriplets(int x) 
{ 
    // To store the factors 
    Vector<Integer> fact = new Vector<Integer>(); 
    HashSet<Integer> factors = new HashSet<Integer>(); 
  
    // Find factors in Math.sqrt(x) time 
    for (int i = 2; i <= Math.sqrt(x); i++)  
    { 
        if (x % i == 0)  
        { 
            fact.add(i); 
            if (x / i != i) 
                fact.add(x / i); 
            factors.add(i); 
            factors.add(x / i); 
        } 
    } 
  
    boolean found = false; 
    int k = fact.size(); 
    for (int i = 0; i < k; i++) 
    { 
  
        // Choose a factor 
        int a = fact.get(i); 
        for (int j = 0; j < k; j++)  
        { 
  
            // Choose another factor 
            int b = fact.get(j); 
  
            // These conditions need to be 
            // met for a valid triplet 
            if ((a != b) && (x % (a * b) == 0) 
                && (x / (a * b) != a) 
                && (x / (a * b) != b) 
                && (x / (a * b) != 1))  
            { 
  
                // Print the valid triplet 
                System.out.print(a+ " " + b + " "
                    + (x / (a * b))); 
                found = true; 
                break; 
            } 
        } 
  
        // Triplet found 
        if (found) 
            break; 
    } 
  
    // Triplet not found 
    if (!found) 
        System.out.print("-1"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int x = 105; 
  
    findTriplets(x); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

