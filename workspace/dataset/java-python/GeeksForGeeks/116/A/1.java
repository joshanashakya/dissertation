

// Java Program to answer queries  
// on sum of sum of odd number   
// digits of all the factors of  
// a number 
class GFG  
{ 
    static int N = 1000005; 
      
    // finding sum of odd digit  
    // number in each integer. 
    static void sumOddDigit(int digitSum[]) 
    { 
          
        // for each number 
        for (int i = 1; i < N; i++) 
        { 
      
            // using previous number sum, 
            // finding the current number  
            // num of odd digit also,  
            // adding last digit if it 
            // is odd. 
            digitSum[i] = digitSum[i / 10] +  
                         (i & 1) * (i % 10); 
        } 
    } 
      
    // finding sum of sum of odd digit  
    // of all the factors of a number. 
    static void sumFactor(int digitSum[],  
                    int factorDigitSum[]) 
    { 
          
        // for each possible factor 
        for (int i = 1; i < N; i++)  
        { 
            for (int j = i; j < N; j += i) 
            { 
                // adding the contribution. 
                factorDigitSum[j] += digitSum[i]; 
            } 
        } 
    } 
      
    // Wrapper function 
    static void wrapper(int q, int n[]) 
    { 
        int digitSum[] = new int[N]; 
        int factorDigitSum[] = new int[N]; 
      
        sumOddDigit(digitSum); 
        sumFactor(digitSum, factorDigitSum); 
      
        for (int i = 0; i < q; i++)  
            System.out.print(factorDigitSum[n[i]] 
                                          + " "); 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        int q = 2; 
        int n[] = new int[]{10, 36}; 
      
        wrapper(q, n); 
          
    } 
} 
  
// This code is contributed by Sam007 

