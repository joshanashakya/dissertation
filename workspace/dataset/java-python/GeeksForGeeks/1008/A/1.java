

// Java implementation of the approach 
  
class GFG  
{ 
  
    static int N = 1000; 
  
    // Function to return the count 
    // of valid pairs 
    static int countPairs(int arr[], int n) 
    { 
  
        // Frequency array 
        // Twice the original size to hold 
        // negative elements as well 
        int size = (2 * N) + 1; 
        int freq[] = new int[size]; 
  
        // Update the frequency of each 
        // of the array element 
        for (int i = 0; i < n; i++) 
        { 
            int x = arr[i]; 
  
            // If say x = -1000 then we will place 
            // the frequency of -1000 at 
            // (-1000 + 1000 = 0) a[0] index 
            freq[x + N]++; 
        } 
  
        // To store the count of valid pairs 
        int ans = 0; 
  
        // Remember we will check only for (even, even) 
        // or (odd, odd) pairs of indexes as the average 
        // of two consecutive elements is 
        // a floating point number 
        for (int i = 0; i < size; i++) 
        { 
  
            if (freq[i] > 0)  
            { 
  
                ans += ((freq[i]) * (freq[i] - 1)) / 2; 
  
                for (int j = i + 2; j < 2001; j += 2) 
                { 
                    if (freq[j] > 0 && (freq[(i + j) / 2] > 0)) 
                    { 
                        ans += (freq[i] * freq[j]); 
                    } 
                } 
            } 
        } 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {4, 2, 5, 1, 3, 5}; 
        int n = arr.length; 
  
        System.out.println(countPairs(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

