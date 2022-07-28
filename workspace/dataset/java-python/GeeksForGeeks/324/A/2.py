

# Python3 implementation of the approach  
  
# Function that returns true  
# if the subsets are possible  
def possible(n) :  
  
    # If n <= 3 then it is not possible  
    # to divide the elements in three subsets  
    # satisfying the given conditions  
    if (n > 3) : 
  
        # Sum of all the elements  
        # in the range [1, n]  
        sum = (n * (n + 1)) // 2;  
  
        # If the sum is divisible by 3  
        # then it is possible  
        if (sum % 3 == 0) : 
            return True;  
      
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5;  
  
    if (possible(n)) : 
        print("Yes");  
    else : 
        print("No");  
          
# This code is contributed by AnkitRai01 

