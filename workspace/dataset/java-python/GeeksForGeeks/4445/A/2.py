

// A hashing based C# program to 
// find missing elements from an array 
using System; 
using System.Collections.Generic; 
  
class GFG { 
  
    // Print all elements of range 
    // [low, high] that are not 
    // present in arr[0..n-1] 
    static void printMissing(int[] arr, int n, 
                             int low, int high) 
    { 
        // Insert all elements of arr[] in set 
        HashSet<int> s = new HashSet<int>(); 
        for (int i = 0; i < n; i++) { 
            s.Add(arr[i]); 
        } 
  
        // Traverse throught the range 
        // an print all missing elements 
        for (int x = low; x <= high; x++) 
            if (!s.Contains(x)) 
                Console.Write(x + " "); 
    } 
  
    // Driver Code 
    public static void Main() 
    { 
        int[] arr = { 1, 3, 5, 4 }; 
        int n = arr.Length; 
        int low = 1, high = 10; 
        printMissing(arr, n, low, high); 
    } 
} 
  
// This code is contributed by ihritik 

