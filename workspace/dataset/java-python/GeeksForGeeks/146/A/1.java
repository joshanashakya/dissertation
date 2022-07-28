

// Java program to print all elements 
// of Array which can be expressed 
// as power of prime numbers 
import java.util.*; 
  
class GFG{ 
   
// Function to mark all the 
// exponent of prime numbers 
static void ModifiedSieveOfEratosthenes( 
    int N, boolean Expo_Prime[]) 
{ 
    boolean []primes = new boolean[N]; 
    Arrays.fill(primes, true); 
   
    for (int i = 2; i < N; i++) { 
   
        if (primes[i]) { 
   
            int no = i; 
   
            // If number is prime then marking 
            // all of its exponent true 
            while (no <= N) { 
   
                Expo_Prime[no] = true; 
                no *= i; 
            } 
   
            for (int j = i * i; j < N; j += i) 
                primes[j] = false; 
        } 
    } 
} 
   
// Function to diplay all required elements 
static void Display(int arr[], 
             boolean Expo_Prime[], 
             int n) 
{ 
   
    for (int i = 0; i < n; i++) 
        if (Expo_Prime[arr[i]]) 
            System.out.print(arr[i]+ " "); 
} 
   
// Function to print the required numbers 
static void FindExpoPrime(int arr[], int n) 
{ 
    int max = 0; 
   
    // To find the largest number 
    for (int i = 0; i < n; i++) { 
        if (max < arr[i]) 
            max = arr[i]; 
    } 
   
    boolean []Expo_Prime = new boolean[max + 1]; 
  
   
    // Function call to mark all the 
    // Exponential prime nos. 
    ModifiedSieveOfEratosthenes( 
        max + 1, Expo_Prime); 
   
    // Function call 
    Display(arr, Expo_Prime, n); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 6, 9, 16, 1, 3, 
                  12, 36, 625, 1000 }; 
    int n = arr.length; 
   
    FindExpoPrime(arr, n); 
} 
} 
  
// This code is contributed by sapnasingh4991 

