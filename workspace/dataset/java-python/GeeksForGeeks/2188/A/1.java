

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
    // Function to return the count  
    // of pairs with distinct sum  
    static int countPairs(int a[], int b[], int n, int m)  
    {  
      
        // To store the required count  
        int cnt = 0;  
      
        // Set to store the sum  
        // obtained for each pair  
        HashSet<Integer> s = new HashSet<Integer>(); 
  
        for (int i = 0; i < n; i++)  
        {  
            for (int j = 0; j < m; j++)  
            {  
      
                // Sum of the current pair  
                int sum = a[i] + b[j];  
      
                // If the sum obtained is distinct  
                if (s.contains(sum) == false)  
                {  
      
                    // Increment the count  
                    cnt++;  
      
                    // Insert sum in the set  
                    s.add(sum);  
                }  
            }  
        }  
      
        return cnt;  
    }  
      
    // Driver code  
    static public void main (String args[]) 
    { 
        int a[] = { 12, 2, 7 };  
        int n = a.length;  
        int b[] = { 4, 3, 8 };  
        int m = b.length;  
      
        System.out.println(countPairs(a, b, n, m));  
    } 
} 
  
// This code is contributed by AnkitRai01 

