

// Java program to find Number of triplets  
// in array having subarray xor equal  
class GFG 
{ 
  
// Function to return the count  
static int xor_triplet(int arr[], int n)  
{  
    // Initialse result  
    int ans = 0;  
  
    // Pick 1st element of the triplet  
    for (int i = 0; i < n; i++)  
    {  
  
        // Pick 2nd element of the triplet  
        for (int j = i + 1; j < n; j++) 
        {  
  
            // Pick 3rd element of the triplet  
            for (int k = j; k < n; k++) 
            {  
                int xor1 = 0, xor2 = 0;  
  
                // Taking xor in the  
                // first subarray  
                for (int x = i; x < j; x++)  
                {  
                    xor1 ^= arr[x];  
                }  
  
                // Taking xor in the  
                // second subarray  
                for (int x = j; x <= k; x++) 
                {  
                    xor2 ^= arr[x];  
                }  
  
                // If both xor is equal  
                if (xor1 == xor2)  
                {  
                    ans++;  
                }  
            }  
        }  
    }  
    return ans;  
}  
  
// Driver Code  
public static void main (String[] args)  
{  
    int arr[] = { 1, 2, 3, 4, 5 };  
    int n = arr.length;  
  
    // Function Calling  
    System.out.println(xor_triplet(arr, n));  
}  
} 
  
// This code is contributed by AnkitRai01 

