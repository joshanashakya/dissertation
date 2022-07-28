

// Java program to count 2s from 0 to n  
class GFG  
{ 
  
// N can be max 10^18 and hence  
// digitsum will be 162 maximum.  
static long dp[][][] = new long[18][2][162];  
  
static long solve(int i, boolean tight, int sum_so_far,  
                int Sum, String number, int len)  
{  
    if (i == len)  
    {  
  
        // If sum_so_far equals to given sum then  
        // return 1 else 0  
        if (sum_so_far == Sum)  
            return 1;  
        else
            return 0;  
    }  
  
    long ans = dp[i][1][sum_so_far];  
    if (ans != -1)  
    {  
        return ans;  
    }  
  
    ans = 0;  
    boolean ntight;  
    int nsum_so_far;  
    for (char currdigit = '0'; currdigit <= '9'; currdigit++)  
    {  
  
        // Our constructed number should not become  
        // greater than N.  
        if (!tight && currdigit > number.charAt(i)) 
        {  
            break;  
        }  
  
        // If tight is true then it will  
        // also be true for (i+1) digit.  
        ntight = tight || currdigit < number.charAt(i);  
        nsum_so_far = sum_so_far + (currdigit - '0');  
        ans += solve(i + 1, ntight, nsum_so_far,  
                        Sum, number, len);  
    }  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args)  
{ 
    long count = 0;  
    int sum = 4;  
    String number = "100";  
    for(int i = 0; i < 18; i++) 
    { 
        for(int j = 0; j < 2; j++) 
        { 
            for(int k = 0; k < 162; k++) 
            dp[i][j][k] = -1; 
        } 
    } 
    System.out.println( solve(0, false, 0, sum,  
                        number, number.length()));  
    } 
}  
  
// This code is contributed by PrinciRaj1992 

