

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
static class pair 
{ 
    int first,second; 
    pair() 
    { 
        first = 0; 
        second = 0; 
    } 
      
} 
  
// Utility function to print the original indices 
// of the elements of the array 
static void printIndices(int n, pair a[]) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print( a[i].second + " "); 
    System.out.println(); 
} 
static class sort implements Comparator<pair>  
{  
    // Used for sorting in ascending order 
    public int compare(pair a, pair b)  
    {  
        return a.first < b.first ? -1 : 1;  
    }  
}  
  
// Function to print the required permutations 
static void printPermutations(int n, int a[], int k) 
{ 
  
    // To keep track of original indices 
    pair arr[] = new pair[n]; 
    for (int i = 0; i < n; i++)  
    { 
        arr[i] = new pair(); 
        arr[i].first = a[i]; 
        arr[i].second = i; 
    } 
  
    // Sort the array 
    Arrays.sort(arr,new sort()); 
  
    // Count the number of swaps that can 
    // be made 
    int count = 1; 
    for (int i = 1; i < n; i++) 
        if (arr[i].first == arr[i - 1].first) 
            count++; 
  
    // Cannot generate 3 permutations 
    if (count < k)  
    { 
        System.out.print( "-1"); 
        return; 
    } 
  
    for (int i = 0; i < k - 1; i++) 
    { 
  
        // Print the first permutation 
        printIndices(n, arr); 
  
        // Find an index to swap and create 
        // second permutation 
        for (int j = 1; j < n; j++)  
        { 
            if (arr[j].first == arr[j - 1].first) 
            { 
                pair t = arr[j]; 
                arr[j] = arr[j - 1]; 
                arr[j - 1] = t; 
                break; 
            } 
        } 
    } 
  
    // Print the last permuation 
    printIndices(n, arr); 
} 
  
// Driver code 
public static void main(String arsg[]) 
{ 
    int a[] = { 1, 3, 3, 1 }; 
    int n = a.length; 
  
    int k = 3; 
    printPermutations(n, a, k); 
} 
} 
  
// This code is contributed by Arnab Kundu 

