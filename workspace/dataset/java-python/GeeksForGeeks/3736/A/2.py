

# Python3 implementation of the approach  
  
# Function to prsum of 2 numbers  
# without propagating carry  
def printSum(a, b):  
  
    res, temp1, temp2 = 0, 0, 0
      
    # Reverse a  
    while a > 0:  
      
        temp1 = temp1 * 10 + (a % 10)  
        a //= 10
      
    a = temp1  
      
    # Reverse b  
    while b > 0:  
      
        temp2 = temp2 * 10 + (b % 10)  
        b //= 10
      
    b = temp2  
      
    # Generate sum  
    # Since length of both a and b are same,  
    # take any one of them.  
    while a:  
          
        # Extract digits from a and b and add  
        Sum = a % 10 + b % 10
          
        # If sum is single digit  
        if Sum // 10 == 0:  
            res = res * 10 + Sum
          
        else: 
          
            # If sum is not single digit  
            # reverse sum  
            temp1 = 0
            while Sum > 0:  
              
                temp1 = temp1 * 10 + (Sum % 10)  
                Sum //= 10
              
            Sum = temp1  
              
            # Extract digits from sum and  
            # append to result  
            while Sum > 0:  
              
                res = res * 10 + (Sum % 10)  
                Sum //= 10
          
        a //= 10
        b //= 10
      
    return res  
  
# Driver code  
if __name__ == "__main__":  
  
    a, b = 7752, 8834
    print(printSum(a, b)) 
      
# This code is contributed  
# by Rituraj Jain 

