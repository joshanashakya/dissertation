

// Java program to find the sum of  
// remaining sticks after each iterations  
import java.util.HashMap;  
import java.util.Map;  
  
class GFG  
{ 
      
    // Function to calculate  
    // sum of remaining sticks  
    // after each iteration  
    static int sum(int ar[], int n)  
    {  
        HashMap<Integer,  
                Integer> mp = new HashMap<>(); 
      
        for (int i = 0; i < n; i++) 
        { 
            mp.put(ar[i], 0); 
        } 
          
        // storing frequency of stick length 
        for (int i = 0; i < n; i++) 
        {  
            mp.put(ar[i], mp.get(ar[i]) + 1) ;  
        }  
      
        int sum = 0;  
      
        for(Map.Entry p : mp.entrySet()) 
        { 
            n -= (int)p.getValue();  
            sum += n;  
        }  
        return sum;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 6;  
        int ar[] = { 5, 4, 4, 2, 2, 8 };  
      
        int ans = sum(ar, n);  
      
        System.out.println(ans);  
      
    }  
} 
  
// This code is contributed by kanugargng 

