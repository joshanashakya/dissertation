

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count 
    // of digits in num 
    public static int countDigits(int num) 
    { 
        int cnt = 0; 
        while (num > 0) { 
            cnt++; 
            num /= 10; 
        } 
        return cnt; 
    } 
  
    // Function to return the sum 
    // of first n digits of num 
    public static int sumFromStart(int num, int n, int rem) 
    { 
  
        // Remove the unnecessary digits 
        num /= ((int)Math.pow(10, rem)); 
  
        int sum = 0; 
        while (num > 0) { 
            sum += (num % 10); 
            num /= 10; 
        } 
        return sum; 
    } 
  
    // Function to return the sum 
    // of the last n digits of num 
    public static int sumFromEnd(int num, int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum += (num % 10); 
            num /= 10; 
        } 
        return sum; 
    } 
  
    public static float getAverage(int n, int k, int l) 
    { 
  
        // If the average can't be calculated without 
        // using the same digit more than once 
        int totalDigits = countDigits(n); 
        if (totalDigits < (k + l)) 
            return -1; 
  
        // Sum of the last l digits of n 
        int sum1 = sumFromEnd(n, l); 
  
        // Sum of the first k digits of n 
        // (totalDigits - k) must be removed from the 
        // end of the number to get the remaining 
        // k digits from the beginning 
        int sum2 = sumFromStart(n, k, totalDigits - k); 
  
        // Return the average 
        return ((float)(sum1 + sum2) / (float)(k + l)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 123456, k = 2, l = 3; 
        System.out.print(getAverage(n, k, l)); 
    } 
} 

