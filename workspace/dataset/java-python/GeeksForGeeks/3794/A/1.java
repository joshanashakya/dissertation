

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static int MAX =100001;  
  
// Function to perform queries to find  
// number of distinct elements from  
// a given index till last index in an array  
static void find_distinct(int a[], int n, int q, int queries[])  
{  
    int []check = new int[MAX];  
    int []idx = new int[MAX];  
    int cnt = 1;  
    for (int i = n - 1; i >= 0; i--)  
    {  
        // Check if current element  
        // already visited or not  
        if (check[a[i]] == 0)  
        {  
  
            // If not visited store current counter  
            // and incremet it and mark check as 1  
            idx[i] = cnt;  
            check[a[i]] = 1;  
            cnt++;  
        }  
        else 
        {  
  
            // Otherwise if visited simply  
            // store current counter  
            idx[i] = cnt - 1;  
        }  
    }  
  
    // Perform queries  
    for (int i = 0; i < q; i++) 
    {  
            int m = queries[i];  
            System.out.print(idx[m] + " ");  
    }  
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    int a[] = { 1, 2, 3, 1, 2, 3, 4, 5 };  
    int n = a.length;  
    int queries[] = { 0, 3, 5, 7 };  
    int q = queries.length;  
    find_distinct(a, n, q, queries); 
} 
} 
  
// This code is contributed by Rajput-Ji 

