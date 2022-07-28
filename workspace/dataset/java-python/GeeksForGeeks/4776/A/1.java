

// Java program to find the card at given index 
// after N shuffles 
class GFG { 
      
    // function to find card at given index 
    static void shuffle(int N, int key) 
    { 
      
        // Answer will be reversal of N bits from MSB 
        int NO_OF_BITS = N; 
        int reverse_num = 0, temp; 
      
        // Calculating the reverse binary representation 
        for (int i = 0; i < NO_OF_BITS; i++) { 
            temp = (key & (1 << i)); 
            if (temp>0) 
                reverse_num |= (1 << ((NO_OF_BITS - 1) - i)); 
        } 
      
        // Printing the result 
        System.out.print(reverse_num); 
    } 
      
    //Driver code 
    public static void main (String[] args) 
    { 
          
        // No. of Shuffle Steps 
        int N = 3; 
      
        // Key position 
        int key = 3; 
      
        shuffle(N, key); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

