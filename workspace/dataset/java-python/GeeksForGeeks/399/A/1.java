

// Naive Java program to count number of pairs 
// such that their hcf and lcm are equal 
import java.util.*; 
  
class GFG{ 
   
// Function to return HCF of two numbers 
static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
   
// Function to return LCM of two numbers 
static int lcm(int a, int b) 
{ 
    return (a * b) / gcd(a, b); 
} 
   
// Returns the number of valid pairs 
static int countPairs(int arr[], int n) 
{ 
    int ans = 0; // initializing answer 
   
    // Traversing the array. For each array 
    // element, checking if it 
    // follow the condition 
    for (int i = 0; i < n; i++) 
        for (int j = i + 1; j < n; j++) 
            if (lcm(arr[i], arr[j]) == gcd(arr[i], arr[j])) 
                ans++; 
    return ans; 
} 
   
// Driver function 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 1 }; 
    int n = arr.length; 
    System.out.print(countPairs(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

