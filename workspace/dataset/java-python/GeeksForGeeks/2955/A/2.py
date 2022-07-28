

# Python3 implementation of the approach  
  
# Function to return the count of valid pairs  
def cntPairs(a, n) :  
  
    # To store the count of odd numbers and  
    # the count of even numbers such that 2  
    # is the only even factor of that number  
    odd = 0; even = 0;  
  
    for i in range(n) : 
  
        # If current number is odd  
        if (a[i] % 2 == 1) : 
            odd += 1;  
  
        # If current number is even and 2  
        # is the only even factor of it  
        elif ((a[i] / 2) % 2 == 1) : 
            even += 1;  
      
    # Calculate total number of valid pairs  
    ans = odd * even + (odd * (odd - 1)) // 2;  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 4, 2, 7, 11, 14, 15, 18 ];  
    n = len(a);  
  
    print(cntPairs(a, n));  
      
# This code is contributed by AnkitRai01 

