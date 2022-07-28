

// Java program to find two  
// Fibonacci numbers whose  
// sum can be represented as N  
import java.util.*; 
  
class GFG{  
  
// Function to create hash table  
// to check Fibonacci numbers  
static void createHash(HashSet<Integer> hash,  
                int maxElement)  
{  
  
    // Storing the first two numbers  
    // in the hash  
    int prev = 0, curr = 1;  
    hash.add(prev);  
    hash.add(curr);  
  
    // Finding Fibonacci numbers up to N  
    // and storing them in the hash  
    while (curr < maxElement) {  
        int temp = curr + prev;  
        hash.add(temp);  
        prev = curr;  
        curr = temp;  
    }  
}  
  
// Function to find the Fibonacci pair  
// with the given sum  
static void findFibonacciPair(int n)  
{  
    // creating a set containing  
    // all fibonacci numbers  
    HashSet<Integer> hash = new HashSet<Integer>();  
    createHash(hash, n);  
  
    // Traversing all numbers  
    // to find first pair  
    for (int i = 0; i < n; i++) {  
  
        // If both i and (N - i) are Fibonacci  
        if (hash.contains(i) 
            && hash.contains(n - i)) {  
  
            // Printing the pair because  
            // i + (N - i) = N  
            System.out.print(i+ ", "
                + (n - i) +"\n");  
            return;  
        }  
    }  
  
    // If no fibonacci pair is found  
    // whose sum is equal to n  
    System.out.print("-1\n");  
}  
  
// Driven code  
public static void main(String[] args)  
{  
    int N = 90;  
  
    findFibonacciPair(N);  
} 
}  
  
// This code is contributed by PrinciRaj1992 

