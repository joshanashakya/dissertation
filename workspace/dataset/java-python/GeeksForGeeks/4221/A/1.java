

// Java implementation of the above approach 
  
class Solution { 
  
    // Function to count of all rotations 
    // which are odd and even 
    static void countOddRotations(int n) 
    { 
        int odd_count = 0, even_count = 0; 
        do { 
            int digit = n % 10; 
            if (digit % 2 == 1) 
                odd_count++; 
            else
                even_count++; 
            n = n / 10; 
        } while (n != 0); 
  
        System.out.println("Odd = " + odd_count); 
        System.out.println("Even = " + even_count); 
    } 
  
    public static void main(String[] args) 
    { 
        int n = 1234; 
        countOddRotations(n); 
    } 
} 

