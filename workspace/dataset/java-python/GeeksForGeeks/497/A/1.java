

// Java program to count the occurrence 
// of nth term in first n terms 
// of Van Eck's sequence 
  
class GFG { 
  
    static int MAX = 100000; 
    static int sequence[] = new int[MAX + 1]; 
  
    // Utility function to compute 
    // Van Eck's sequence 
    static void vanEckSequence() 
    { 
  
        // Initialize sequence array 
        for (int i = 0; i < MAX; i++) { 
            sequence[i] = 0; 
        } 
  
        // Loop to generate sequence 
        for (int i = 0; i < MAX; i++) { 
  
            // Check if sequence[i] has occured 
            // previously or is new to sequence 
            for (int j = i - 1; j >= 0; j--) { 
                if (sequence[j] == sequence[i]) { 
  
                    // If occurrence found 
                    // then the next term will be 
                    // how far back this last term 
                    // occured previously 
                    sequence[i + 1] = i - j; 
                    break; 
                } 
            } 
        } 
    } 
  
    // Utility function to count 
    // the occurrence of nth term 
    // in first n terms of the sequence 
    static int getCount(int n) 
    { 
  
        // Get nth term of the sequence 
        int nthTerm = sequence[n - 1]; 
  
        int count = 0; 
  
        // Count the occurrence of nth term 
        // in first n terms of the sequence 
        for (int i = 0; i < n; i++) { 
  
            if (sequence[i] == nthTerm) 
                count++; 
        } 
  
        // Return count 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Pre-compute Van Eck's sequence 
        vanEckSequence(); 
  
        int n = 5; 
  
        // Print count of the occurrence of nth term 
        // in first n terms of the sequence 
        System.out.println(getCount(n)); 
  
        n = 11; 
  
        // Print count of the occurrence of nth term 
        // in first n terms of the sequence 
        System.out.println(getCount(n)); 
    } 
} 

