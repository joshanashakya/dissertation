

// A Simple Method to count cubes between a and b 
  
class GFG{ 
   
// Function to count cubes between two numbers 
static int countCubes(int a, int b) 
{ 
    int cnt = 0; // Initialize result 
   
    // Traverse through all numbers 
    for (int i = a; i <= b; i++) 
   
        // Check if current number 'i' is perfect 
        // cube 
        for (int j = 1; j * j * j <= i; j++) 
            if (j * j * j == i) 
                cnt++; 
   
    return cnt; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int a = 7, b = 30; 
    System.out.print("Count of Cubes is "
         + countCubes(a, b)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

