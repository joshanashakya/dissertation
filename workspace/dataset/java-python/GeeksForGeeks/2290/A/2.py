

# Python 3 implementation of the approach 
  
# function that checks the divisibility  
# of the sum of the digits at odd places 
# of the given number 
def SumDivisible(n, k): 
  
    sum = 0
    position = 1
    while (n > 0) : 
  
        # if position is odd 
        if (position % 2 == 1): 
            sum += n % 10
        n = n // 10
        position += 1
      
    if (sum % k == 0): 
        return True
    return False
  
# Driver code 
if __name__ =="__main__": 
    n = 592452
    k = 3
  
    if (SumDivisible(n, k)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed  
# by ChitraNayal 

