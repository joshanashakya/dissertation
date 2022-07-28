

// Java program to find the GCD of 
// elements which occur Fibonacci 
// number of times 
import java.util.*; 
  
class GFG{ 
   
// Function to create hash table 
// to check Fibonacci numbers 
static void createHash(HashSet<Integer> hash, 
                int maxElement) 
{ 
    // Inserting the first two 
    // numbers into the hash 
    int prev = 0, curr = 1; 
    hash.add(prev); 
    hash.add(curr); 
   
    // Adding the remaining Fibonacci 
    // numbers using the previously 
    // added elements 
    while (curr <= maxElement) { 
        int temp = curr + prev; 
        hash.add(temp); 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to return the GCD of elements 
// in an array having fibonacci frequency 
static int gcdFibonacciFreq(int arr[], int n) 
{ 
    HashSet<Integer> hash = new HashSet<Integer>(); 
   
    // Creating the hash 
    createHash(hash,Arrays.stream(arr).max().getAsInt()); 
   
    int i; 
   
    // Map is used to store the 
    // frequencies of the elements 
    HashMap<Integer,Integer> m = new HashMap<Integer,Integer>(); 
   
    // Iterating through the array 
    for (i = 0; i < n; i++) { 
        if(m.containsKey(arr[i])){ 
            m.put(arr[i], m.get(arr[i])+1); 
        } 
        else{ 
            m.put(arr[i], 1); 
        } 
    } 
   
    int gcd = 0; 
   
    // Traverse the map using iterators 
    for (Map.Entry<Integer, Integer> it : m.entrySet()) { 
   
        // Calculate the gcd of elements 
        // having fibonacci frequencies 
        if (hash.contains(it.getValue())) { 
            gcd = __gcd(gcd, 
                        it.getKey()); 
        } 
    } 
   
    return gcd; 
} 
static int __gcd(int a, int b)   
{   
    return b == 0? a:__gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 3, 6, 5, 
                  6, 6, 5, 5 }; 
    int n = arr.length; 
   
    System.out.print(gcdFibonacciFreq(arr, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

