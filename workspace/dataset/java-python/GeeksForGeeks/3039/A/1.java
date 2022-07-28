

// Java implementation of the approach  
class GfG 
{  
  
// Function to find the number of pairs  
// from the set of natural numbers up to  
// N whose sum is divisible by K  
static int findPairCount(int N, int K)  
{  
    int count = 0;  
  
    // Declaring a Hash to store count  
    int rem[] = new int[K];  
  
    rem[0] = N / K;  
  
    // Storing the count of integers with  
    // a specific remainder in Hash array  
    for (int i = 1; i < K; i++)  
        rem[i] = (N - i) / K + 1;  
  
    // Check if K is even  
    if (K % 2 == 0)  
    {  
        // Count of pairs when both  
        // integers are divisible by K  
        count += (rem[0] * (rem[0] - 1)) / 2;  
  
        // Count of pairs when one remainder  
        // is R and other remainder is K - R  
        for (int i = 1; i < K / 2; i++)  
            count += rem[i] * rem[K - i];  
  
        // Count of pairs when both the  
        // remainders are K / 2  
        count += (rem[K / 2] * (rem[K / 2] - 1)) / 2;  
    }  
    else
    {  
        // Count of pairs when both  
        // integers are divisible by K  
        count += (rem[0] * (rem[0] - 1)) / 2;  
  
        // Count of pairs when one remainder is R  
        // and other remainder is K - R  
        for (int i = 1; i <= K / 2; i++)  
            count += rem[i] * rem[K - i];  
    }  
  
    return count;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int N = 10, K = 4;  
  
    // Print the count of pairs  
    System.out.println(findPairCount(N, K));  
} 
}  
  
// This code is contributed by Prerna Saini 

