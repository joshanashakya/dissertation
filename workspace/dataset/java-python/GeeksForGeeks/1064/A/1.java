

// Java program to find the number of indices pair 
// such that pair sum from first Array 
// is greater than second Array 
import java.util.*; 
  
class GFG{ 
  
// Function to get the number of pairs of indices 
// {i, j} in the given two arrays A and B such that 
// A[i] + A[j] > B[i] + B[j] 
static long getPairs(Vector<Integer> A, Vector<Integer> B, int n) 
{ 
    // Intitializing the difference array D 
    int []D = new int[n]; 
  
    // Computing the difference between the 
    // elements at every index and storing 
    // it in the array D 
    for (int i = 0; i < n; i++) 
    { 
        D[i] = A.get(i) - B.get(i); 
    } 
  
    // Sort the array D 
    Arrays.sort(D); 
  
    // Variable to store the total 
    // number of pairs that satisfy 
    // the given condition 
    long total = 0; 
  
    // Loop to iterate through the difference 
    // array D and find the total number 
    // of pairs of indices that follow the 
    // given condition 
    for (int i = n - 1; i >= 0; i--) { 
  
        // If the value at the index i is positive, 
        // then it remains positive for any pairs 
        // with j such that j > i. 
        if (D[i] > 0) { 
            total += n - i - 1; 
        } 
  
        // If the value at that index is negative 
        // then we need to find the index of the 
        // value just greater than -D[i] 
        else { 
            int k = upper_bound(D,0, D.length, -D[i]); 
            total += n - k; 
        } 
    } 
    return total; 
} 
static int upper_bound(int[] a, int low,  
                        int high, int element) 
{ 
    while(low < high){ 
        int middle = low + (high - low)/2; 
        if(a[middle] > element) 
            high = middle; 
        else
            low = middle + 1; 
    } 
    return low; 
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
    Vector<Integer> A = new Vector<Integer>(); 
    Vector<Integer> B= new Vector<Integer>(); 
  
    A.add(4); 
    A.add(8); 
    A.add(2); 
    A.add(6); 
    A.add(2); 
  
    B.add(4); 
    B.add(5); 
    B.add(4); 
    B.add(1); 
    B.add(3); 
  
    System.out.print(getPairs(A, B, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

