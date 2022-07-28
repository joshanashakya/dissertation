

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
// Function to return the maximum bitwise 
// OR of any pair from the given range 
static int max_bitwise_or(int L, int R) 
{ 
    Vector<Integer> v1 = new Vector<Integer>(), 
                    v2 = new Vector<Integer>(), 
                    v3 = new Vector<Integer>(); 
  
    int z = 0, i, ans = 0, cnt = 1; 
  
    // Converting L to its binary representation 
    while (L > 0) 
    { 
        v1.add(L % 2); 
        L = L / 2; 
    } 
  
    // Converting R to its binary representation 
    while (R > 0) 
    { 
        v2.add(R % 2); 
        R = R / 2; 
    } 
  
    // In order to make the number 
    // of bits of L and R same 
    while (v1.size() != v2.size()) 
    { 
  
        // Push 0 to the MSB 
        v1.add(0); 
    } 
  
    for (i = v2.size() - 1; i >= 0; i--)  
    { 
  
        // When ith bit of R is 1 
        // and ith bit of L is 0 
        if (v2.get(i) == 1 && v1.get(i) == 0 && z == 0) 
        { 
            z = 1; 
            continue; 
        } 
  
        // From MSB side set all bits of L to be 1 
        if (z == 1)  
        { 
  
            // From (i+1)th bit, all bits 
            // of L changed to be 1 
            v1.remove(i); 
            v1.add(i,1); 
        } 
    } 
  
    for (i = 0; i < v2.size(); i++) 
    { 
        v3.add(v2.get(i) | v1.get(i)); 
    } 
  
    for (i = 0; i < v2.size(); i++) 
    { 
        if (v3.get(i) == 1)  
        { 
            ans += cnt; 
        } 
        cnt *= 2; 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int L = 10, R = 20; 
  
    System.out.println(max_bitwise_or(L, R)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

