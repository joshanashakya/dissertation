

// Java program to Find number of  
// Triplets 1 <= a <= b<= c <= n,  
// Such that a^2 + b^2 = c^2  
class Solution 
{ 
// function to ind number of  
// Triplets 1 <= a <= b<= c <= n,  
// Such that a^2 + b^2 = c^2  
static int Triplets(int n)  
{  
    // to store required answer  
    int ans = 0;  
  
    // run nested loops for first two numbers.  
    for (int i = 1; i <= n; ++i) {  
        for (int j = i; j <= n; ++j) {  
            int x = i * i + j * j;  
  
            // third number  
            int y =(int) Math.sqrt(x);  
  
            // check if third number is perfect  
            // square and less than n  
            if (y * y == x && y <= n)  
                ++ans;  
        }  
    }  
  
    return ans;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
  
    int n = 10;  
  
    // function call  
    System.out.println(Triplets(n));  
  
}  
} 
//contributed by Arnab Kundu 

