

// Java program to print k-th distinct  
// element in a given array  
import java.util.*; 
  
class GfG  
{ 
  
// Returns k-th distinct  
// element in arr.  
static int printKDistinct(int arr[], 
                        int n, int k)  
{  
    //int dist_count = 0;  
    Map <Integer, Integer> h =  
       new HashMap<Integer, Integer> ();  
         
    for (int i = 0; i < n; i++)  
    { 
        if(h.containsKey(arr[i])) 
            h.put(arr[i], h.get(arr[i]) + 1); 
        else
            h.put(arr[i], 1); 
    } 
  
    // If size of hash is  
    // less than k.  
    if (h.size() < k)  
        return -1;  
  
    // Traverse array again and  
    // find k-th element with  
    // count as 1.  
    int dist_count = 0;  
    for (int i = 0; i < n; i++)  
    {  
        if (h.get(arr[i]) == 1)  
            dist_count++;  
        if (dist_count == k)  
            return arr[i];  
    }  
    return -1;  
}  
  
// Driver Code  
public static void main (String[] args)  
{  
    int ar[] = {1, 2, 1, 3, 4, 2};  
    int n = ar.length;  
    System.out.println(printKDistinct(ar, n, 2));  
} 
}  
  
// This code is contributed by  
// Prerna Saini 

