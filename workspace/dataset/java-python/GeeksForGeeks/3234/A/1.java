

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the 
// number of positive area triangles 
static int countTriangles(int a[], int n) 
{ 
  
    // To store the count of 
    // total triangles 
    int cnt = 0; 
  
    // To store the count of pairs of sticks 
    // with equal lengths 
    int pairs = 0; 
  
    // Back-traverse and count 
    // the number of triangles 
    for (int i = n - 1; i >= 0; i--)  
    { 
  
        // Count the number of pairs 
        pairs += a[i] / 2; 
  
        // If we have one remaining stick 
        // and we have a pair 
        if (a[i] % 2 == 1 && pairs > 0)  
        { 
  
            // Count 1 triangle 
            cnt += 1; 
  
            // Reduce one pair 
            pairs -= 1; 
        } 
    } 
  
    // Count the remaining triangles 
    // that can be formed 
    cnt += (2 * pairs) / 3; 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 2, 2, 2 }; 
    int n = a.length; 
    System.out.println(countTriangles(a, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

