

# Python 3 implementation of  
# the above approach 
  
# Function to count the numbers 
def findNumbers(N) : 
  
    # Initialize vector array that  
    # store result. 
    v = []; 
  
    # Get the each decimal and find  
    # its count store in vector. 
    while (N) : 
  
        n, m, p = N, 0, 1
        while (n) : 
  
            # find decimal 
            if (n % 10) : 
                m += p 
  
            n //= 10
            p *= 10
  
        v.append(m); 
  
        # Decrement N by m for 
        # each decimal 
        N -= m 
  
    # Loop for each element of vector 
    # And print its content. 
    for i in range(len(v)) : 
        print(v[i], end = " ") 
  
# Driver Code 
if __name__ == "__main__" : 
      
    N = 31
    findNumbers(N) 
  
# This code is contributed by Ryuga 

