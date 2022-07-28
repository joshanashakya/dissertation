

# Python3 program to find Minimum number to be added  
# to all digits of X to make X > Y  
  
# Function to check if X  
# is lexicographically larger Y  
def IsLarger(X, Y, n) : 
  
    for i in range(n) : 
  
        # It is lexicographically larger  
        if (X[i] < Y[i]) : 
            return False;  
  
    return True;  
  
# Utility function to check  
# minimum value of d  
def solve(X, Y, n) :  
  
    ans = 0;  
      
    # If X is already larger  
    # do not need to add anything  
    if (IsLarger(X, Y, n)) : 
        ans = 0;  
  
    else : 
  
        # Adding d to all elements of X  
        d = Y[0] - X[0];  
  
        for i in range(n) : 
            X[i] += d;  
  
        # If X is larger now  
        # print d  
        if (IsLarger(X, Y, n)) : 
            ans = d;  
        # else print d + 1  
        else : 
            ans = d + 1;  
  
    return ans;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    # Taking the numbers as sequences  
    X = [ 2, 3, 6, 9 ];  
    Y = [ 3, 4, 8, 1 ];  
  
    n = len(X);  
    print(solve(X, Y, n));  
  
# This code is contributed by AnkitRai01 

