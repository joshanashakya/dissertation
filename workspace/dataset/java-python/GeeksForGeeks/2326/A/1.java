

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of odd days 
    static int oddDays(int N) 
    { 
        // Count of years divisible 
        // by 100 and 400 
        int hund1 = N / 100; 
        int hund4 = N / 400; 
  
        // Every 4th year is a leap year 
        int leap = N >> 2; 
        int ord = N - leap; 
  
        // Every 100th year is divisible by 4 
        // but is not a leap year 
        if (hund1 > 0) { 
            ord += hund1; 
            leap -= hund1; 
        } 
  
        // Every 400th year is divisible by 100 
        // but is a leap year 
        if (hund4 > 0) { 
            ord -= hund4; 
            leap += hund4; 
        } 
  
        // Total number of extra days 
        int days = ord + leap * 2; 
  
        // modulo(7) for final answer 
        int odd = days % 7; 
  
        return odd; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
  
        // Number of days 
        int N = 100; 
        System.out.print(oddDays(N)); 
    } 
} 

