

// Java program to find pairs of positive 
// and negative values present in an array. 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Print pair with negative and positive value 
    public static void printPairs(int arr[] , int n) 
    { 
        Vector<Integer> v = new Vector<Integer>(); 
        // For each element of array. 
        for (int i = 0; i < n; i++)  
  
            // Try to find the negative value of  
            // arr[i] from i + 1 to n 
            for (int j = i + 1; j < n; j++)  
  
                // If absolute values are equal 
                // print pair. 
                if (Math.abs(arr[i]) == 
                                  Math.abs(arr[j]))  
                    v.add(Math.abs(arr[i]));  
  
  
        // If size of vector is 0, therefore there 
        // is no element with positive negative  
        // value, print "0" 
        if (v.size() == 0) 
            return;      
      
        // Sort the vector 
        Collections.sort(v); 
  
        // Print the pair with negative positive 
        // value. 
        for (int i = 0; i < v.size(); i++) 
            System.out.print(-v.get(i) + " " +  
                                      v.get(i));  
    } 
  
    // Driven Program 
    public static void main(String[] args) 
    { 
        int arr[] = { 4, 8, 9, -4, 1, -1, -8, -9 }; 
        int n = arr.length; 
        printPairs(arr, n); 
    } 
} 
  
// This code is contributed by Prasad Kshirsagar. 

