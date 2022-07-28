

# Python3 implementation of the approach  
  
# Function to return the count of pairs  
# which satisfy the given condition  
def solve(A, B, n) :  
    cnt = 0;  
  
    for i in range(n) :  
        for j in range(i, n) :  
  
            # Check if the count of set bits  
            # in the AND value is B[j]  
            c = A[i] & A[j] 
            if (bin(c).count('1') == B[j]) : 
                cnt += 1;  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = [ 2, 3, 1, 4, 5 ];  
    B = [ 2, 2, 1, 4, 2 ];  
      
    size = len(A);  
  
    print(solve(A, B, size));  
  
# This code is contributed  
# by AnkitRai01 

