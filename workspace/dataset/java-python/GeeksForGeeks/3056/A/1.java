

// Java program to implement  
// standard deviation of grouped data. 
import java.io.*; 
  
class GFG { 
      
    // Function to find mean of grouped data. 
    static float mean(float mid[], int freq[], int n) 
    { 
        float sum = 0, freqSum = 0; 
        for (int i = 0; i < n; i++)  
        { 
            sum = sum + mid[i] * freq[i]; 
            freqSum = freqSum + freq[i]; 
        } 
        return sum / freqSum; 
    } 
      
    // Function to find standard 
    // deviation of grouped data. 
    static float groupedSD(float lower_limit[], 
                          float upper_limit[], 
                            int freq[], int n) 
    { 
        float mid[] = new float[n]; 
        float sum = 0, freqSum = 0, sd; 
        for (int i = 0; i < n; i++)  
        { 
            mid[i] = (lower_limit[i] + upper_limit[i]) / 2; 
            sum = sum + freq[i] * mid[i] * mid[i]; 
            freqSum = freqSum + freq[i]; 
        } 
      
        // Formula to find standard deviation 
        // deviation of grouped data. 
        sd = (float)Math.sqrt((sum - freqSum * mean(mid, freq, n) *  
                        mean(mid, freq, n)) / (freqSum - 1)); 
        return sd; 
    } 
  
    // Driver function. 
    public static void main (String[] args) 
    { 
        // Declare and initialize 
        // the lower limit of interval. 
        float lower_limit[] = { 50, 61, 71, 86, 96 }; 
      
        // Declare and initialize 
        // the upper limit of interval. 
        float upper_limit[] = { 60, 70, 85, 95, 100 }; 
        int freq[] = { 9, 7, 9, 12, 8 }; 
      
        // Calculating the size of array. 
        int n = lower_limit.length; 
      
        System.out.println( groupedSD(lower_limit,  
                            upper_limit, freq, n)); 
              
    } 
} 
  
// This code is contributed by vt_m 

