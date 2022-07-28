

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
    // Function to return the count of quadruples 
    static int countQuadruples(int a[], int n)  
    { 
  
        // Hash table to count the number of occurrences 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
  
        // Traverse and increment the count 
        for (int i = 0; i < n; i++) 
            if (mp.containsKey(a[i])) 
            { 
                mp.put(a[i], mp.get(a[i]) + 1); 
            } 
            else
            { 
                mp.put(a[i], 1); 
            } 
  
        int count = 0; 
  
        // Run two nested loop for second and third element 
        for (int j = 0; j < n; j++) 
        { 
            for (int k = 0; k < n; k++) 
            { 
  
                // If they are same 
                if (j == k) 
                    continue; 
  
                // Initially decrease the count 
                mp.put(a[j], mp.get(a[j]) - 1); 
                mp.put(a[k], mp.get(a[k]) - 1); 
  
                // Find the first element using common difference 
                int first = a[j] - (a[k] - a[j]); 
  
                // Find the fourth element using GP 
                // y^2 = x * z property 
                int fourth = (a[k] * a[k]) / a[j]; 
  
                // If it is an integer 
                if ((a[k] * a[k]) % a[j] == 0) 
                { 
  
                    // If not equal 
                    if (a[j] != a[k])  
                    { 
                        if (mp.containsKey(first) && mp.containsKey(fourth)) 
                            count += mp.get(first) * mp.get(fourth); 
                    } 
                      
                    // Same elements 
                    else if (mp.containsKey(first) && mp.containsKey(fourth)) 
                        count += mp.get(first) * (mp.get(fourth) - 1); 
                } 
  
                // Later increase the value for 
                // future calculations 
                if (mp.containsKey(a[j])) 
                { 
                    mp.put(a[j], mp.get(a[j]) + 1); 
                }  
                else
                { 
                    mp.put(a[j], 1); 
                } 
                if (mp.containsKey(a[k])) 
                { 
                    mp.put(a[k], mp.get(a[k]) + 1); 
                }  
                else 
                { 
                    mp.put(a[k], 1); 
                } 
            } 
        } 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 2, 6, 4, 9, 2 }; 
        int n = a.length; 
  
        System.out.print(countQuadruples(a, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

