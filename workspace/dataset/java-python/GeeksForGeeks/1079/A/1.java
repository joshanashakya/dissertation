

// Java implmentation to find the  
// Kth number in the list formed  
// from product of any two numbers  
// in the array and sorting them 
import java.util.*;  
  
class GFG  
{ 
      
    // Function to find number of pairs  
    static boolean check(int x, Vector pos, Vector neg, int k)  
    {  
        int pairs = 0;  
      
        int p = neg.size() - 1;  
        int nn = neg.size() - 1;  
        int pp = pos.size() - 1;  
      
        // Negative and Negative  
        for (int i = 0; i < neg.size(); i++)  
        {  
            while ((p >= 0) && ((int)neg.get(i) *  
                    (int)neg.get(p) <= x))  
                p--;  
      
            // Add Possible Pairs  
            pairs += Math.min(nn - p, nn - i);  
        }  
      
        // Positive and Positive  
        p = 0;  
        for (int i = pos.size() - 1; i >= 0; i--) 
        {  
            while ((p < pos.size()) && ((int)pos.get(i) *  
                    (int)pos.get(p) <= x))  
                p++;  
      
            // Add Possible pairs  
            pairs += Math.min(p, i);  
        }  
      
        // Negative and Positive  
        p = pos.size() - 1;  
        for (int i = neg.size() - 1;  
            i >= 0; i--) {  
            while ((p >= 0) && ((int)neg.get(i) *  
                    (int)pos.get(p) <= x))  
                p--;  
      
            // Add Possible pairs  
            pairs += pp - p;  
        }  
      
        return (pairs >= k);  
    }  
      
    // Function to find the kth  
    // element in the list  
    static int kth_element(int a[], int n, int k)  
    {  
        Vector pos = new Vector(); 
        Vector neg = new Vector();;  
      
        // Seperate Postive and  
        // Negative elements  
        for (int i = 0; i < n; i++) 
        {  
            if (a[i] >= 0)  
                pos.add(a[i]);  
            else
                neg.add(a[i]);  
        }  
      
        // Sort the Elements  
        //sort(pos.begin(), pos.end());  
        //sort(neg.begin(), neg.end());  
        Collections.sort(pos); 
        Collections.sort(neg); 
      
        int l = (int)-1e8, ans = 0, r = (int)1e8;  
      
        // Binary search  
        while (l <= r) 
        {  
            int mid = (l + r) >> 1;  
            if (check(mid, pos, neg, k))  
            {  
                ans = mid;  
                r = mid - 1;  
            }  
            else
                l = mid + 1;  
        }  
      
        // Return the required answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a[] = { -4, -2, 3, 3 }, k = 3;  
        int n = a.length;  
      
        // Function call  
        System.out.println(kth_element(a, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

