

# Python3 implementation of the approach  
  
# Function to find the required permutation  
def findPerm(Q, n) :  
  
    minval = 0; qsum = 0;  
    for i in range(n - 1) : 
  
        # Each element in P' is like a  
        # cumulative sum in Q  
        qsum += Q[i];  
  
        # minval is the minimum  
        # value in P'  
        if (qsum < minval) : 
            minval = qsum;  
  
    P = [0]*n;  
    P[0] = 1 - minval;  
  
    # To check if each entry in P  
    # is from the range [1, n]  
    permFound = True;  
      
    for i in range(n - 1) : 
        P[i + 1] = P[i] + Q[i];  
  
        # Invalid permutation  
        if (P[i + 1] > n or P[i + 1] < 1) : 
            permFound = False;  
            break;  
  
    # If a valid permutation exists  
    if (permFound) : 
  
        # Print the permutation  
        for i in range(n) : 
            print(P[i],end=" ");  
    else : 
  
        # No valid permutation  
        print(-1);  
  
# Driver code  
if __name__ == "__main__" :  
  
    Q = [ -2, 1 ];  
    n = 1 + len(Q) ; 
  
    findPerm(Q, n);  
      
# This code is contributed by AnkitRai01 

