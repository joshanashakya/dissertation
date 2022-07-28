

# Python3 implementation of the approach  
  
# Function to return the count of pairs  
# which satisfy the given condition  
def solve(A, B, n) :  
  
    cnt = 0;  
    for i in range(n) : 
        for j in range(i, n) :  
  
            # Check if the count of set bits  
            # in the OR value is B[j]  
            if (bin(A[i] | A[j]).count('1') == B[j]) : 
                cnt += 1;  
              
    return cnt  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = [ 5, 3, 2, 4, 6, 1 ];  
    B = [ 2, 2, 1, 4, 2, 3 ];  
    size = len(A);  
  
    print(solve(A, B, size));  
  
# This code is contributed by AnkitRai01 

