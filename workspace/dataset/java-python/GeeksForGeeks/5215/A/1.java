

// Java program to find Pythagorean   
// Triplet of given sum. 
class GFG 
{ 
    static void pythagoreanTriplet(int n) 
    { 
          
        // Considering triplets in  
        // sorted order. The value  
        // of first element in sorted  
        // triplet can be at-most n/3. 
        for (int i = 1; i <= n / 3; i++) 
        { 
              
            // The value of second element 
            // must be less than equal to n/2 
            for (int j = i + 1; j <= n / 2; j++) 
            { 
                int k = n - i - j; 
                if (i * i + j * j == k * k)  
                { 
                    System.out.print(i + ", "+  
                                j + ", " + k); 
                    return; 
                } 
            } 
        }  
      
        System.out.print("No Triplet"); 
    } 
      
    // Driver Code 
    public static void main(String arg[]) 
    { 
        int n = 12; 
          
        pythagoreanTriplet(n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

