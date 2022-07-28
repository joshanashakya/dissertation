

// Java implmentation to find the number 
// the number of ways to reach Nth stair 
// by taking 1, 2 step at a time and 
// 3 Steps at a time exactly once. 
class GFG 
{ 
  
// Function to find the number 
// the number of ways to reach Nth stair 
static int number_of_ways(int n) 
{ 
    // Array including number 
    // of ways that includes 3 
    int []includes_3 = new int[n + 1]; 
      
    // Array including number of 
    // ways that doesn't includes 3 
    int []not_includes_3 = new int[n + 1]; 
  
    // Intially to reach 3 stairs by 
    // taking 3 steps can be 
    // reached by 1 way 
    includes_3[3] = 1; 
  
    not_includes_3[1] = 1; 
    not_includes_3[2] = 2; 
    not_includes_3[3] = 3; 
  
    // Loop to find the number 
    // the number of ways to reach Nth stair 
    for (int i = 4; i <= n; i++)  
    { 
        includes_3[i] 
            = includes_3[i - 1] + includes_3[i - 2] +  
               not_includes_3[i - 3]; 
        not_includes_3[i] 
            = not_includes_3[i - 1] + not_includes_3[i - 2]; 
    } 
    return includes_3[n]; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 7; 
  
    System.out.print(number_of_ways(n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

