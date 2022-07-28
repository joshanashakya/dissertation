

// Java implementation of the approach  
class GFG 
{ 
      
// Function to return the  
// most significant bit  
static int msb(int x)  
{  
    int ret = 0;  
    while ((x >> (ret + 1)) != 0)  
        ret++;  
    return ret;  
}  
  
// Function to return the required XOR  
static int xorRange(int l, int r)  
{  
  
    // Finding the MSB  
    int max_bit = msb(r);  
  
    // Value of the current bit to be added  
    int mul = 2;  
  
    // To store the final answer  
    int ans = 0;  
  
    // Loop for case 1  
    for (int i = 1; i <= max_bit; i++) 
    {  
  
        // Edge case when both the integers  
        // lie in the same segment of continuous  
        // 1s  
        if ((l / mul) * mul == (r / mul) * mul)  
        {  
            if (((l & (1 << i)) != 0) && (r - l + 1) % 2 == 1)  
                ans += mul;  
            mul *= 2;  
            continue;  
        }  
  
        // To store whether parity of count is odd  
        int odd_c = 0;  
  
        if (((l & (1 << i)) != 0) && l % 2 == 1)  
            odd_c = (odd_c ^ 1);  
        if (((r & (1 << i)) != 0) && r % 2 == 0)  
            odd_c = (odd_c ^ 1);  
  
        // Updating the answer if parity is odd  
        if (odd_c!=0)  
            ans += mul;  
  
        // Updating the number to be added  
        mul *= 2;  
    }  
  
    // Case 2  
    int zero_bit_cnt = zero_bit_cnt = (r - l + 1) / 2;  
  
    if (l % 2 == 1 && r % 2 == 1)  
        zero_bit_cnt++;  
  
    if (zero_bit_cnt % 2 == 1)  
        ans++;  
  
    return ans;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int l = 1, r = 4;  
  
    // Final answer  
    System.out.print(xorRange(l, r));  
} 
}  
  
// This code is contributed by Arnab Kundu 

