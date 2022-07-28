

# Python3 implementation of above approach 
  
# function to return the odd sum 
def Odd_Sum(n): 
  
    # total odd elements upto n 
    total =(n+1)//2
  
    # sum of odd elements upto n 
    odd = total*total 
    return odd 
  
# function to return the even sum 
def Even_Sum(n): 
  
    # total even elements upto n 
    total = n//2
  
    # sum of even elements upto n 
    even = total*(total+1) 
    return even 
  
def sumLtoR(L,R): 
    odd_sum = Odd_Sum(R)-Odd_Sum(L-1) 
    even_sum = Even_Sum(R)- Even_Sum(L-1) 
  
    # return final sum from L to R 
    return even_sum-odd_sum 
  
  
# Driver code 
L =1; R = 5
print(sumLtoR(L,R)) 
  
# This code is contributed by Shrikant13 

