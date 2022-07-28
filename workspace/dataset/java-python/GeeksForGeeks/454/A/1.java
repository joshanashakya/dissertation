

// Java program to print the count of  
// elements present in the NxM matrix  
import java.util.*; 
  
class GFG  
{ 
  
// Function to print the count of  
// elements present in the NxM matrix  
static void printCount(int a[][], int n, int m, 
                                int z[], int l)  
{  
    // iterate in the n rows  
    for (int i = 0; i < n; i++) 
    {  
        // map to mark elements in N-th row  
        Map<Integer,Integer> mp = new HashMap<>(); 
  
        // mark all elements in the n-th row  
        for (int j = 0; j < m; j++)  
            mp.put(a[i][j], 1);  
  
        int count = 0;  
  
        // check for occurrence of all elements  
        for (int j = 0; j < l; j++)  
        {  
            if (mp.containsKey(z[j]))  
                count += 1;  
        }  
  
        // print the occurrence of all elements  
                System.out.println("row" +(i + 1) + " = " + count);  
    }  
}  
  
// Driver Code  
public static void main(String[] args)  
{ 
    // NxM matrix  
    int a[][] = { { 8, 27, 39, 589, 23 },  
                { 23, 34, 589, 12, 45 },  
                { 939, 32, 27, 12, 78 },  
                { 23, 349, 48, 21, 32 } };  
  
    // elements array  
    int arr[] = { 589, 39, 27 };  
  
    int n = a.length;  
  
    int m = 5;  
  
    int l = arr.length;  
  
    printCount(a, n, m, arr, l);  
    } 
} 
  
// This code is contributed by 29AjayKumar 

