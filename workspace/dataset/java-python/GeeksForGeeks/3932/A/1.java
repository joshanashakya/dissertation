

// Java implementation to find length of longest  
// strict bitonic subsequence  
import java.util.*; 
  
class GfG  
{ 
      
// function to find length of longest  
// strict bitonic subsequence  
static int longLenStrictBitonicSub(int arr[], int n)  
{  
    // hash table to map the array element with the  
    // length of the longest subsequence of which  
    // it is a part of and is the last/first element of  
    // that subsequence  
    HashMap<Integer, Integer> inc = new HashMap<Integer, Integer> (); 
    HashMap<Integer, Integer> dcr = new HashMap<Integer, Integer> ();  
      
    // arrays to store the length of increasing and  
    // decreasing subsequences which end at them  
    // or start from them  
    int len_inc[] = new int[n]; 
    int len_dcr[] = new int[n];  
      
    // to store the length of longest strict  
    // bitonic subsequence  
    int longLen = 0;  
      
    // traverse the array elements  
    // from left to right  
    for (int i = 0; i < n; i++)  
    {  
        // initialize current length  
        // for element arr[i] as 0  
        int len = 0;  
              
        // if 'arr[i]-1' is in 'inc'  
        if (inc.containsKey(arr[i] - 1))  
            len = inc.get(arr[i] - 1);  
              
        // update arr[i] subsequence length in 'inc'      
        // and in len_inc[]  
        len_inc[i] = len + 1; 
        inc.put(arr[i], len_inc[i]); 
    }  
      
    // traverse the array elements  
    // from right to left  
    for (int i = n - 1; i >= 0; i--)  
    {  
        // initialize current length  
        // for element arr[i] as 0  
        int len = 0;  
              
        // if 'arr[i]-1' is in 'dcr'  
        if (dcr.containsKey(arr[i] - 1))  
            len = dcr.get(arr[i] - 1);  
              
        // update arr[i] subsequence length in 'dcr'  
        // and in len_dcr[]  
        len_dcr[i] = len + 1; 
        dcr.put(arr[i], len_dcr[i]);  
    }  
      
    // calculating the length of all the strict  
    // bitonic subsequence  
    for (int i = 0; i < n; i++)  
        if (longLen < (len_inc[i] + len_dcr[i] - 1))  
            longLen = len_inc[i] + len_dcr[i] - 1;  
          
    // required longest length strict  
    // bitonic subsequence  
    return longLen;      
}  
      
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = {1, 5, 2, 3, 4, 5, 3, 2};  
    int n = arr.length;  
    System.out.println("Longest length strict " +  
                            "bitonic subsequence = " +  
                            longLenStrictBitonicSub(arr, n));  
} 
}  
  
// This code is contributed by  
// prerna saini 

