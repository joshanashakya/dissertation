

// Java program to find that 
// substring which is its 
// suffix prefix and also 
// found somewhere in betweem 
class GFG 
{ 
  
// Z-algorithm function 
static int[] z_function(char []s) 
{ 
    int n = s.length; 
    int []z = new int[n]; 
    for (int i = 1, l = 0, r = 0;  
             i < n; i++)  
    { 
        if (i <= r) 
            z[i] = Math.min(r - i + 1, 
                            z[i - l]); 
  
        while (i + z[i] < n && 
                 s[z[i]] == s[i + z[i]]) 
            z[i]++; 
  
        if (i + z[i] - 1 > r) 
        { 
            l = i; r = i + z[i] - 1; 
        } 
    } 
    return z; 
} 
  
static int n, len = 0; 
  
// BIT array 
static int []bit = new int[1000005]; 
  
static String s; 
static int[] z; 
  
// bit update function which 
// updates values from index 
// "idx" to last by value "val" 
static void update(int idx, int val) 
{ 
    if (idx == 0) 
        return; 
    while (idx <= n) 
    { 
        bit[idx] += val; 
        idx += (idx & -idx); 
    } 
} 
  
// Query function in bit 
static int pref(int idx) 
{ 
    int ans = 0; 
    while (idx > 0) 
    { 
        ans += bit[idx]; 
        idx -= (idx & -idx); 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    s = "geeksisforgeeksinplatformgeeks"; 
    z = new int[s.length()]; 
    n = s.length(); 
  
    // Making the z array 
    z = z_function(s.toCharArray()); 
  
    // update in the bit array from 
    // index z[i] by increment of 1 
    for (int i = 1; i < n; i++)  
    { 
        update(z[i], 1); 
    } 
  
    for (int i = n - 1; i > 1; i--) 
    { 
        // if the value in z[i] is 
        // not equal to (n-i) then no 
        // need to move further 
        if (z[i] != (n - i)) 
            continue; 
  
        // queryng for the maximum 
        // length substring from 
        // bit array 
        if (pref(n) - pref(z[i] - 1) >= 2)  
        { 
            len = Math.max(len, z[i]); 
        } 
    } 
  
    if (len == 0) 
        System.out.println("-1"); 
    else
        System.out.println(s.substring(0, len)); 
} 
} 
  
// This code is contributed  
// by PrinciRaj1992 

