

// Java  program to count pairs  
// with XOR giving a even number 
  
import java.io.*; 
  
class GFG { 
    // Function to count number of even pairs  
static int findEvenPair(int A[], int N)  
{  
    int count = 0;  
  
    // find all pairs  
    for (int i = 0; i < N; i++) {  
        if (A[i] % 2 != 0)  
            count++;  
    }  
  
    int totalPairs = (N * (N - 1) / 2);  
    int oddEvenPairs = count * (N - count);  
  
    // return number of even pair  
    return totalPairs - oddEvenPairs;  
}  
  
// Driver Code  
      
    public static void main (String[] args) { 
      
    int a[] = { 5, 4, 7, 2, 1 };  
    int n = a.length;  
    // calling function findEvenPair  
    // and print number of even pair  
    System.out.println(findEvenPair(a, n));  
    } 
//This code is contributed by akt_mit     
} 

