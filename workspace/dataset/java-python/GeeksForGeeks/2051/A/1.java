

// Java implementation of above approach 
  
class GFG{ 
// Function to return count of Ordered pairs 
// whose product are less than N 
static int countOrderedPairs(int N) 
{ 
    // Initialize count to 0 
    int count_pairs = 0; 
  
    // count total pairs 
    for (int i = 1; i <= (int)Math.sqrt(N - 1); ++i) { 
        for (int j = i; j * i < N; ++j) 
            ++count_pairs; 
    } 
  
    // multiply by 2 to get ordered_pairs 
    count_pairs *= 2; 
  
    // subtract redundant pairs (a, b) where a==b. 
    count_pairs -= (int)(Math.sqrt(N - 1)); 
  
    // return answer 
    return count_pairs; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 5; 
  
    // function call to print required answer 
    System.out.println(countOrderedPairs(N)); 
} 
} 
// This code is contributed by mits 

