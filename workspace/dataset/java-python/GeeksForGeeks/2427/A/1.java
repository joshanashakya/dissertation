

// Java program to find sum of numbers from 
// 1 to N which are divisible by X or Y 
  
public class GFG{ 
      
    // Function to calculate the sum 
    // of numbers divisible by X or Y 
    static int sum(int N, int X, int Y) 
    { 
        int S1, S2, S3; 
      
        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2; 
        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2; 
        S3 = ((N / (X * Y))) * (2 * (X * Y) 
                          + (N / (X * Y) - 1) * (X * Y))/ 2; 
      
        return S1 + S2 - S3; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int N = 14; 
        int X = 3, Y = 5; 
      
        System.out.println(sum(N, X, Y)); 
      
    } 
    // This code is contributed by Ryuga 
} 

