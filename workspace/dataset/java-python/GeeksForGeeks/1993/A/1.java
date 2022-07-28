

// Java implementation of the above approach  
import java.util.*; 
class GfG {  
  
// Initial DP array  
static int dp[][][][] = new int[64][64][64][2];  
  
// Recursive function to generate  
// all combinations of bits  
static int func(int third, int seta, int setb,  
                int carry, int number)  
{  
  
    // if the state has already been visited  
    if (dp[third][seta][setb][carry] != -1)  
        return dp[third][seta][setb][carry];  
  
    // find if C has no more set bits on left  
    int shift = (number >> third);  
  
    // if no set bits are left for C  
    // and there are no set bits for A and B  
    // and the carry is 0, then  
    // this combination is possible  
    if (shift == 0 && seta == 0 && setb == 0 && carry == 0)  
        return 1;  
  
    // if no set bits are left for C and  
    // requirement of set bits for A and B have exceeded  
    if (shift == 0 || seta < 0 || setb < 0)  
        return 0;  
  
    // Find if the bit is 1 or 0 at  
    // third index to the left  
    int mask = shift & 1;  
  
    dp[third][seta][setb][carry] = 0;  
  
    // carry = 1 and bit set = 1  
    if ((mask == 1) && carry == 1) {  
  
        // since carry is 1, and we need 1 at C's bit position  
        // we can use 0 and 0  
        // or 1 and 1 at A and B bit position  
        dp[third][seta][setb][carry]  
                            += func(third + 1, seta, setb, 0, number)  
                            + func(third + 1, seta - 1, setb - 1, 1, number);  
    }  
  
    // carry = 0 and bit set = 1  
    else if (mask == 1 && carry == 0) {  
  
        // since carry is 0, and we need 1 at C's bit position  
        // we can use 1 and 0  
        // or 0 and 1 at A and B bit position  
        dp[third][seta][setb][carry]  
                                    += func(third + 1, seta - 1, setb, 0, number)  
                                    + func(third + 1, seta, setb - 1, 0, number);  
    }  
  
    // carry = 1 and bit set = 0  
    else if (mask == 0 && carry == 1) {  
  
        // since carry is 1, and we need 0 at C's bit position  
        // we can use 1 and 0  
        // or 0 and 1 at A and B bit position  
        dp[third][seta][setb][carry] += func(third + 1, seta - 1, setb, 1, number)  
                                    + func(third + 1, seta, setb - 1, 1, number);  
    }  
  
    // carry = 0 and bit set = 0  
    else if (mask == 0 && carry == 0) {  
  
        // since carry is 0, and we need 0 at C's bit position  
        // we can use 0 and 0  
        // or 1 and 1 at A and B bit position  
        dp[third][seta][setb][carry] += func(third + 1, seta, setb, 0, number)  
                                    + func(third + 1, seta - 1, setb - 1, 1, number);  
    }  
  
    return dp[third][seta][setb][carry];  
}  
  
// Function to count ways  
static int possibleSwaps(int a, int b, int c)  
{  
    for(int q = 0; q < 64; q++) 
    { 
        for(int r = 0; r < 64; r++) 
        { 
            for(int p = 0; p < 64; p++) 
            { 
                for(int d = 0; d < 2; d++) 
                { 
                    dp[q][r][p][d] = -1; 
                } 
            } 
        } 
    } 
      
  
    // function call that returns the  
    // answer  
    int ans = func(0, a, b, 0, c);  
  
    return ans;  
}  
  
// Driver Code  
public static void main(String[] args)  
{  
  
    int x = 2, y = 2, c = 20;  
  
    System.out.println(possibleSwaps(x, y, c));  
} 
}  

