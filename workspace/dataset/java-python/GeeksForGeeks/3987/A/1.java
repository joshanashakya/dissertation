

// Java implementation of the approach 
  
class GFG 
{ 
      
// Function to return the number of  
// trailing zeros 
static int trailing_zeros(int N) 
{ 
  
    // To store the number of 2s and 5s 
    int count_of_two = 0, count_of_five = 0; 
  
    for (int i = 1; i <= N; i++)  
    { 
        int val = i; 
        while (val % 2 == 0 && val > 0)  
        { 
            val /= 2; 
  
            // If we get a factor 2 then we  
            // have i number of 2s because  
            // the power of the number is  
            // raised to i 
            count_of_two += i; 
        } 
  
        while (val % 5 == 0 && val > 0) 
        { 
            val /= 5; 
  
            // If we get a factor 5 then  
            // we have i number of 5s 
            // because the power of the  
            // number is raised to i 
            count_of_five += i; 
        } 
    } 
  
    // Take the minimum of them 
    int ans = Math.min(count_of_two, count_of_five); 
  
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int N = 12; 
    System.out.println(trailing_zeros(N)); 
} 
} 
  
// This code is contributed by chandan_jnu 

