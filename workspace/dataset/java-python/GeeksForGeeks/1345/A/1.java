

// A simple Java program to count divisors 
// in array multiplication. 
  
class GFG 
{ 
    // To count number of factors in a number 
    static int counDivisors(int X) 
    { 
        // Initialize count with 0 
        int count = 0; 
          
        // Increment count for every factor 
        // of the given number X. 
        for (int i = 1; i <= X; ++i)  
        { 
            if (X % i == 0) { 
                count++; 
            } 
        } 
      
        // Return number of factors 
        return count; 
    } 
      
    // Returns number of divisors in array 
    // multiplication 
    static int countDivisorsMult(int arr[], int n) 
    { 
        // Multipliying all elements of 
        // the given array. 
        int mul = 1; 
        for (int i = 0; i < n; ++i)  
            mul *= arr[i]; 
          
        // Calling function which count  
        // number of factors of the number 
        return counDivisors(mul); 
    } 
      
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 2, 4, 6 }; 
        int n = arr.length; 
        System.out.println(countDivisorsMult(arr, n)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

