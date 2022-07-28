

// Java code for counting minimum  
// de-arrangements present in an array. 
import java.util.*; 
import java.lang.*; 
import java.util.Arrays; 
  
public class GeeksforGeeks{ 
      
    // function to count Dearrangement 
    public static int countDe(int arr[], int n){ 
        int v[] = new int[n]; 
          
        // create a copy of original array 
        for(int i = 0; i < n; i++) 
            v[i] = arr[i];  
              
        // sort the array 
        Arrays.sort(arr); 
      
        // traverse sorted array for  
        // counting mismatches 
        int count1 = 0; 
        for (int i = 0; i < n; i++)  
            if (arr[i] != v[i]) 
            count1++;      
      
        // reverse the sorted array 
        Collections.reverse(Arrays.asList(arr)); 
  
        // traverse reverse sorted array  
        // for counting mismatches 
        int count2 = 0; 
        for (int i = 0; i < n; i++) 
            if (arr[i] != v[i])      
                count2++; 
  
        // return minimum mismatch count 
        return (Math.min (count1, count2)); 
    } 
  
    // driver code 
    public static void main(String argc[]){ 
        int arr[] = {5, 9, 21, 17, 13}; 
        int n = 5; 
        System.out.println("Minimum Dearrangement = "+ 
                            countDe(arr, n)); 
    } 
} 
  
/*This code is contributed by Sagar Shukla.*/

