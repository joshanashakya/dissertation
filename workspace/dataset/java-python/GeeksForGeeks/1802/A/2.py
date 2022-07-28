

# Python 3 implementation of the above approach 
  
# Below function checks whether product 
# of digits at even places is divisible 
# by sum of digits at odd places 
def productSumDivisible(n, size): 
    sum = 0
    product = 1
    while (n > 0) : 
  
        # if size is even 
        if (size % 2 == 0) : 
            product *= n % 10
  
        # if size is odd 
        else : 
            sum += n % 10
          
        n = n // 10
        size -= 1
  
    if (product % sum == 0): 
        return True
    return False
  
# Driver code 
if __name__ == "__main__": 
    n = 1234
    len = 4
  
    if (productSumDivisible(n, len)): 
        print("TRUE") 
    else : 
        print("FALSE") 
  
# This code is contributed by ChitraNayal 

