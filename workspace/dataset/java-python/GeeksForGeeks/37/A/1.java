

// Java implementation to find the 
// series in which every term is 
// sum of previous K terms 
  
class Sum { 
    // Function to generate the 
    // series in the form of array 
    void sumOfPrevK(int N, int K) 
    { 
        int arr[] = new int[N]; 
        int prevsum = 0; 
        arr[0] = 1; 
  
        // Pick a starting point 
        for (int i = 0; i < N - 1; i++) { 
  
            // Computing the previous sum 
            if (i <= K) { 
                arr[i + 1] = arr[i] + prevsum; 
                prevsum = arr[i + 1]; 
            } 
            else { 
                arr[i + 1] = arr[i] + prevsum 
                             - arr[i + 1 - K]; 
                prevsum = arr[i] + prevsum; 
            } 
        } 
  
        // Loop to print the series 
        for (int i = 0; i < N; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        int N = 8, K = 3; 
        s.sumOfPrevK(N, K); 
    } 
} 

