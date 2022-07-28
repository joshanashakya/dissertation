

# Python3 program to count non decreasing subarrays  
# of size N from N Natural numbers  
  
# Returns value of Binomial Coefficient C(n, k)  
def binomialCoeff(n, k) :  
  
    C = [0] * (k + 1); 
  
    # Since nC0 is 1  
    C[0] = 1;  
  
    for i in range(1, n + 1) : 
  
        # Compute next row of pascal triangle using  
        # the previous row  
        for j in range(min(i, k), 0, -1) :  
            C[j] = C[j] + C[j - 1];  
      
    return C[k];  
  
# Function to find the count of required subarrays  
def count_of_subarrays(N) :  
  
    # The required count is the binomial coefficient  
    # as explained in the approach above  
    count = binomialCoeff(2 * N - 1, N);  
  
    return count;  
  
# Driver Function  
if __name__ == "__main__" :  
      
    N = 3;  
  
    print(count_of_subarrays(N)) ;  
  
# This code is contributed by AnkitRai01 

