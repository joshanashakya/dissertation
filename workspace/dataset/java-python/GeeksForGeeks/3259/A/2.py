

# Python3 implementation of the approach  
import sys 
  
INT_MAX = sys.maxsize 
  
# Function to return the number of i's  
# such that Pi <= Pj for all 1 <= j <= i  
# in the permutation of first N natural numbers  
def min_index(p, n) :  
  
    # To store the count of such indices  
    ans = 0;  
  
    # Store the mini value  
    mini = INT_MAX;  
  
    # For all the elements  
    for i in range(n) :  
        if (p[i] <= mini) : 
            mini = p[i];  
  
        if (mini == p[i]) : 
            ans += 1;  
  
    # Return the required answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    P = [ 4, 2, 5, 1, 3 ];  
    n = len(P); 
    print(min_index(P, n));  
  
# This code is contributed by AnkitRai01 

