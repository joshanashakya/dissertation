

// Java program to find the largest 
// and smallest N-digit numbers 
// in Hexa-Decimal Number System 
class GFG { 
      
    // Function to return the largest 
    // N-digit number in Hexa-Decimal 
    // Number System 
    static String findLargest(int N) 
    { 
          
        String largest = ""; 
        // Append 'F' N times 
        for (int i = 0; i < N ; i++) 
            largest += 'F'; 
      
        return largest; 
    } 
      
    // Function to return the smallest 
    // N-digit number in Hexa-Decimal 
    // Number System 
    static String findSmallest(int N) 
    { 
          
        String smallest = "1" ; 
        // Append '0' (N - 1) times to 1 
        for(int i = 0; i < N - 1; i++) 
            smallest += '0'; 
      
        return smallest; 
    } 
      
    // Function to print the largest and smallest 
    // N-digit Hexa-Decimal number 
    static void print(int largest) 
    { 
        System.out.println("Largest: " + findLargest(largest)) ; 
        System.out.println("Smallest: " + findSmallest(largest)) ; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
      
        int N = 4; 
        print(N); 
      
    } 
} 
  
// This code is contributed by AnkitRai01 

