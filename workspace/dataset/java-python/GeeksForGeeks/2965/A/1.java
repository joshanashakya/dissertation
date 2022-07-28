

// Java implementation of the above approach 
class GFG 
{ 
  
// Function to find the smallest number 
// greater than k represented as 
// the sum of distinct powers 
static void greaterK(int n, int k) 
{ 
  
    // Vector P to store the base k 
    // representation of the number 
    int []p = new int[String.valueOf(n).length() + 2]; 
    int index = 0; 
    int x = n; 
    while (x > 0)  
    { 
        p[index]=(int) (x % k); 
        x /= k; 
        index++; 
    } 
    int idx = 0; 
    for (int i = 0; i < p.length - 1; ++i) 
    { 
        if (p[i] >= 2) 
        { 
  
            // If the representation is >=2, then 
            // this power of k has to be added 
            // once again and then increase the 
            // next power of k and make the 
            // current power 0 
            p[i] = 0; 
            p[i + 1]++; 
  
            // Reduce all the lower power of 
            // k to 0 
            for (int j = idx; j < i; ++j)  
            { 
                p[j] = 0; 
            } 
            idx = i + 1; 
        } 
  
        if (p[i] == k) 
        { 
            p[i] = 0; 
            p[i + 1]++; 
        } 
    } 
    int j = p.length - 1; 
  
    // Check if the most significant 
    // bit also satisfy the above 
    // conditions 
    if (p[j] >= 2)  
    { 
        p[index] = 1; 
        index++; 
    } 
    int ans = 0; 
  
    // Converting back from the 
    // k-nary representation to 
    // decimal form. 
    for (int i = p.length - 1; i >= 0; --i)  
    { 
        ans = ans * k + p[i]; 
    } 
    System.out.print(ans +"\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 29, k = 7; 
    greaterK(n, k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

