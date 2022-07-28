

// Java program to print two 
// permutations from a given sequence 
import java.util.*; 
  
class GFG{ 
   
// Function to check if the sequence is 
// concatenation of two permutations or not 
static boolean checkPermutation(int arr[], int n) 
{ 
    // Computing the sum of all the 
    // elements in the array 
    long sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
   
    // Computing the prefix sum 
    // for all the elements in the array 
    int []prefix = new int[n + 1]; 
    prefix[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        prefix[i] = prefix[i - 1] + arr[i]; 
   
    // Iterating through the i 
    // from lengths 1 to n-1 
    for (int i = 0; i < n - 1; i++) { 
   
        // Sum of first i+1 elements 
        long lsum = prefix[i]; 
   
        // Sum of remaining n-i-1 elements 
        long rsum = sum - prefix[i]; 
   
        // Lengths of the 2 permutations 
        long l_len = i + 1, 
                  r_len = n - i - 1; 
   
        // Checking if the sums 
        // satisfy the formula or not 
        if (((2 * lsum) 
             == (l_len * (l_len + 1))) 
            && ((2 * rsum) 
                == (r_len * (r_len + 1)))) 
            return true; 
    } 
   
    return false; 
} 
   
// Function to print the 
// two permutations 
static void printPermutations(int arr[], int n, 
                       int l1, int l2) 
{ 
    // Print the first permutation 
    for (int i = 0; i < l1; i++) { 
        System.out.print(arr[i]+ " "); 
    } 
    System.out.println(); 
   
    // Print the second permutation 
    for (int i = l1; i < n; i++) { 
        System.out.print(arr[i]+ " "); 
    } 
} 
   
// Function to find the two permutations 
// from the given sequence 
static void findPermutations(int arr[], int n) 
{ 
    // If the sequence is not a 
    // concatenation of two permutations 
    if (!checkPermutation(arr, n)) { 
        System.out.print("Not Possible"); 
        return; 
    } 
   
    int l1 = 0, l2 = 0; 
   
    // Find the largest element in the 
    // array and set the lengths of the 
    // permutations accordingly 
    l1 = Arrays.stream(arr).max().getAsInt(); 
    l2 = n - l1; 
   
    HashSet<Integer> s1 = new HashSet<Integer>(), 
            s2 = new HashSet<Integer>(); 
    for (int i = 0; i < l1; i++) 
        s1.add(arr[i]); 
   
    for (int i = l1; i < n; i++) 
        s2.add(arr[i]); 
   
    if (s1.size() == l1 && s2.size() == l2) 
        printPermutations(arr, n, l1, l2); 
    else { 
        l1 = l1+l2; 
        l2 = l1-l2; 
        l1 = l1-l2; 
        printPermutations(arr, n, l1, l2); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 1, 3, 4, 5, 
                  6, 7, 8, 9, 1, 
                  10, 2 }; 
    int n = arr.length; 
   
    findPermutations(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

