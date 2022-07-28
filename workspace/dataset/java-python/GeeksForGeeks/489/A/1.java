

// Java program to find count of 
// elements in first array whose 
// atleast one factor is present 
// in second array.  
import java.util.*; 
  
class GFG 
{ 
  
    // Util function to count the elements 
    // in first array whose atleast 
    // one factor is present in second array 
    static int elementCount(int arr1[], int n1, 
                            int arr2[], int n2)  
    { 
  
        // counter to count number of elements 
        int count = 0; 
  
        // Hash of second array element 
        HashSet<Integer> hash = new HashSet<>(); 
        for (int i = 0; i < n2; i++)  
        { 
            hash.add(arr2[i]); 
        } 
  
        // loop to traverse through array elements 
        // and check for its factors 
        for (int i = 0; i < n1; i++)  
        { 
  
            // generate factors of elements 
            // of first array 
            for (int j = 1; j * j <= arr1[i]; j++)  
            { 
  
                // Check if j is a factor 
                if (arr1[i] % j == 0) 
                { 
  
                    // check if the factor is present in 
                    // second array using the hash 
                    if ((hash.contains(j) && j !=  
                        (int) hash.toArray()[hash.size() - 1]) || 
                        (hash.contains(arr1[i] / j) && (arr1[i] / j) !=  
                        (int) hash.toArray()[hash.size() - 1]))  
                    { 
                        count++; 
                        break; 
                    } 
                } 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr1[] = {10, 2, 13, 4, 15}; 
        int arr2[] = {2, 4, 5, 6}; 
  
        int n1 = arr1.length; 
        int n2 = arr2.length; 
        System.out.println(elementCount(arr1, n1, arr2, n2)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

