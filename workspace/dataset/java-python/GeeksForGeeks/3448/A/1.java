

// JAVA program to find harmonic mean. 
  
class GFG { 
      
    // Function that returns harmonic mean. 
    static float harmonicMean(int arr[], int freq[], 
                              int n) 
    { 
        float sum = 0, frequency_sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum = sum + (float)freq[i] / arr[i]; 
            frequency_sum  = frequency_sum  + freq[i]; 
        } 
        return (frequency_sum / sum); 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
        int num[] = { 13, 14, 15, 16, 17 }; 
        int freq[] = { 2, 5, 13, 7, 3 }; 
        int n = num.length; 
        System.out.println(harmonicMean(num, freq, n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

