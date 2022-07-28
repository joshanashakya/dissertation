

// Java implementation of the approach 
class GFGq  
{ 
  
static int max_Element = (int) (1e6 + 5); 
  
// Global array declaration 
static int sum1[] = new int[max_Element], sum2[] =  
        new int[max_Element], sum3[] = new int[max_Element]; 
  
// Function to find the sum of multiplication of 
// every triplet in the divisors of a number 
static void precomputation(int arr[], int n) 
{ 
    // sum1[x] represents the sum of all the divisors of x 
    for (int i = 1; i < max_Element; i++) 
        for (int j = i; j < max_Element; j += i) 
  
            // Adding i to sum1[j] because i 
            // is a divisor of j 
            sum1[j] += i; 
  
    // sum2[x] represents the sum of all the divisors of x 
    for (int i = 1; i < max_Element; i++) 
        for (int j = i; j < max_Element; j += i) 
  
            // Here i is divisor of j and sum1[j] - i 
            // represents sum of all divisors of 
            // j which do not include i so we add 
            // i * (sum1[j] - i) to sum2[j] 
            sum2[j] += (sum1[j] - i) * i; 
  
    // In the above implementation we have considered 
    // every pair two times so we have to divide 
    // every sum2 array element by 2 
    for (int i = 1; i < max_Element; i++) 
        sum2[i] /= 2; 
  
    // Here i is the divisor of j and we are trying to 
    // add the sum of multiplication of all triplets of 
    // divisors of j such that one of the divisors is i 
    for (int i = 1; i < max_Element; i++) 
        for (int j = i; j < max_Element; j += i) 
            sum3[j] += i * (sum2[j] - i * (sum1[j] - i)); 
  
    // In the above implementation we have considered 
    // every triplet three times so we have to divide 
    // every sum3 array element by 3 
    for (int i = 1; i < max_Element; i++) 
        sum3[i] /= 3; 
  
    // Print the results 
    for (int i = 0; i < n; i++) 
        System.out.print(sum3[arr[i]] + " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 9, 5, 6 }; 
    int n = arr.length; 
  
    // Precomputing 
    precomputation(arr, n); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

