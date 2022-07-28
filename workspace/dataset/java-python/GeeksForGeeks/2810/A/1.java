

// Java program to find all good indices  
// in the given array  
import java.util.*; 
class Solution 
{ 
    
// Function to find all good indices  
// in the given array  
static void niceIndices(int A[], int n)  
{  
    int sum = 0;  
    
    // hash to store frequency  
    // of each element  
    Map<Integer, Integer> m=new HashMap<Integer, Integer>();  
      
    // Storing frequency of each element  
    // and calculating sum simultaneously  
    for (int i = 0; i < n; ++i) {  
          
        m.put(A[i],(m.get(A[i])==null)?0:m.get(A[i])+1);  
        sum += A[i];  
    }  
    
    for (int i = 0; i < n; ++i) {  
        int k = sum - A[i];  
        if (k % 2 == 0) {  
            k = k >> 1;  
    
            // check if array is good after  
            // removing i-th index element  
            if (m.containsKey(k)) {  
    
                if ((A[i] == k && m.get(k) > 1) || (A[i] != k))  
                    // print good indices  
                    System.out.print( (i + 1) +" ");  
            }  
        }  
    }  
}  
    
// Driver Code  
public static void main(String args[]) 
{  
    int A[] = { 8, 3, 5, 2 };  
    int n = A.length;  
    
    niceIndices(A, n);  
    
}  
} 
//contributed by Arnab Kundu 

