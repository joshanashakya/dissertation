

# Python 3 implementation of the approach 
  
# Function to return the count 
# of all possible values for x 
# such that (A % x) = B 
def countX( a, b): 
    # Case 1 
    if (b > a): 
        return 0
  
    # Case 2 
    elif (a == b): 
        return -1
  
    # Case 3 
    else: 
        x = a - b 
        ans = 0
  
        # Find the number of divisors of x 
        # which are greater than b 
        i = 1
        while i * i <= x: 
            if (x % i == 0): 
                d1 = i 
                d2 = b - 1
                if (i * i != x): 
                    d2 = x // i 
                if (d1 > b): 
                    ans+=1
                if (d2 > b): 
                    ans+=1
            i+=1
        return ans 
  
# Driver code 
if __name__ == "__main__": 
    a = 21
    b = 5
  
    print(countX(a, b)) 
      
    # This code is contributed by ChitraNayal 

