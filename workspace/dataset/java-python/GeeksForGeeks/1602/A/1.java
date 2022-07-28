

// Java to find largest bitonic sequence such that 
import java.util.*; 
  
class GFG  
{ 
    static Vector<Integer> res = new Vector<>(); 
  
    // utility Binary search 
    static Integer GetCeilIndex(Integer[] arr, Integer[] T,  
                                Integer l, Integer r, Integer key)  
    { 
        while (r - l > 1)  
        { 
            Integer m = l + (r - l) / 2; 
            if (arr[T[m]] >= key) 
                r = m; 
            else
                l = m; 
        } 
        return r; 
    } 
  
    // function to find LIS in reverse form 
    static void LIS(Integer[] arr, Integer n) 
    { 
  
        // Add boundary case, when array n is zero 
        // Depend on smart pointers 
        Integer[] tailIndices = new Integer[n]; 
        Integer[] prevIndices = new Integer[n]; 
        Arrays.fill(tailIndices, 0); // Initialized with 0 
        Arrays.fill(prevIndices, -1); // initialized with -1 
  
        Integer len = 1; // it will always point to empty location 
        for (Integer i = 1; i < n; i++)  
        { 
            // new smallest value 
            if (arr[i] < arr[tailIndices[0]]) 
                tailIndices[0] = i; 
  
            // arr[i] wants to extend largest subsequence 
            else if (arr[i] > arr[tailIndices[len - 1]])  
            { 
                prevIndices[i] = tailIndices[len - 1]; 
                tailIndices[len++] = i; 
            } 
  
            // arr[i] wants to be a potential candidate of 
            // future subsequence 
            // It will replace ceil value in tailIndices 
            else 
            { 
                Integer pos = GetCeilIndex(arr,  
                            tailIndices, -1, len - 1, arr[i]); 
                prevIndices[i] = tailIndices[pos - 1]; 
                tailIndices[pos] = i; 
            } 
        } 
  
        // put LIS into vector 
        for (Integer i = tailIndices[len - 1]; i >= 0; i = prevIndices[i]) 
            res.add(arr[i]); 
    } 
  
    // function for finding longest bitonic seq 
    static void longestBitonic(Integer[] arr1, Integer n1, 
                                Integer[] arr2, Integer n2) 
    { 
        // find LIS of array 1 in reverse form 
        LIS(arr1, n1); 
  
        // reverse res to get LIS of first array 
        Collections.reverse(res); 
  
        // reverse array2 and find its LIS 
        Collections.reverse(Arrays.asList(arr2)); 
        LIS(arr2, n2); 
  
        // print result 
        for (Integer i = 0; i < res.size(); i++) 
            System.out.print(res.elementAt(i) + " "); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        Integer[] arr1 = { 1, 2, 4, 3, 2 }; 
        Integer[] arr2 = { 8, 6, 4, 7, 8, 9 }; 
        Integer n1 = arr1.length; 
        Integer n2 = arr2.length; 
        longestBitonic(arr1, n1, arr2, n2); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

