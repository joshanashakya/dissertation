

// Java implementation to find the 
// series in which every term is 
// sum of previous K terms 
  
class Sum { 
    // Function to generate the 
    // series in the form of array 
    void sumOfPrevK(int N, int K) 
    { 
        int arr[] = new int[N]; 
        arr[0] = 1; 
  
        // Pick a starting point 
        for (int i = 1; i < N; i++) { 
            int j = i - 1, count = 0, 
                sum = 0; 
            // Find the sum of all 
            // elements till count < K 
            while (j >= 0 && count < K) { 
                sum += arr[j]; 
                j--; 
                count++; 
            } 
            // Find the value of 
            // sum at i position 
            arr[i] = sum; 
        } 
        for (int i = 0; i < N; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        int N = 10, K = 4; 
        s.sumOfPrevK(N, K); 
    } 
} 

