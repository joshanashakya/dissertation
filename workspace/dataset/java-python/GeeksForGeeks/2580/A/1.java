

// Java program to find sum of elements 
// in an array having composite frequency 
import java.util.*; 
  
class GFG{ 
static final int N = 10005; 
  
// Function to create 
// Sieve to check primes 
static void SieveOfEratosthenes(Vector<Boolean> composite) 
{ 
    for (int i = 0; i < N; i++) 
    {  
        composite.add(i, false); 
    } 
  
    for (int p = 2; p * p < N; p++) { 
  
        // If composite[p] is not changed, 
        // then it is a prime 
        if (!composite.get(p)) { 
  
            // Update all multiples of p, 
            // set them to composite 
            for (int i = p * 2; i < N; i += p) { 
                composite.add(i, true); 
            } 
        } 
    } 
} 
  
// Function to return the sum of elements 
// in an array having composite frequency 
static int sumOfElements(int arr[], int n) 
{ 
    Vector<Boolean> composite = new Vector<Boolean>(); 
    for (int i = 0; i < N; i++) 
        composite.add(false); 
    SieveOfEratosthenes(composite); 
  
    // Map is used to store 
    // element frequencies 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
    for (int i = 0; i < n; i++) 
        if(mp.containsKey(arr[i])){ 
            mp.put(arr[i], mp.get(arr[i]) + 1); 
        } 
        else{ 
            mp.put(arr[i], 1); 
        } 
  
    // To store sum 
    int sum = 0; 
  
    // Traverse the map using iterators 
    for (Map.Entry<Integer,Integer> it : mp.entrySet()){ 
  
        // Count the number of elements 
        // having composite frequencies 
        if (composite.get(it.getValue())) { 
            sum += (it.getKey()); 
        } 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 1, 1, 1, 
                3, 3, 2, 4 }; 
  
    int n = arr.length; 
  
    // Function call 
    System.out.print(sumOfElements(arr, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

