

// Java program to Check if the array  
// has an element which is equal to sum  
// of all the remaining elements  
import java.util.*; 
class Solution{ 
  
// Function to check if such element exists or not  
static boolean isExists(int a[], int n)  
{  
    // Storing frequency in map  
    Map<Integer, Integer> freq= new HashMap<Integer, Integer>();  
    
    // Stores the sum  
    int sum = 0;  
    
    // Traverse the array and count the  
    // array elements  
    for (int i = 0; i < n; i++) {  
        freq.put(a[i],freq.get(a[i])==null?0:freq.get(a[i])+1);  
        sum += a[i];  
    }  
    
    // Only possible if sum is even  
    if (sum % 2 == 0) {  
        // If half sum is available  
        if (freq.get(sum / 2)!=null)  
            return true;  
    }  
    
    return false;  
}  
    
// Driver code  
public static void main(String args[]) 
{  
    int a[] = { 5, 1, 2, 2 };  
    
    int n = a.length;  
    
    if (isExists(a, n))  
        System.out.println( "Yes");  
    else
        System.out.println( "No");  
    
}  
} 
//contributed by Arnab Kundu 

