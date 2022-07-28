

# Program to count factorial 
# numbers in given range 
  
def countFact(low,high): 
  
    # Find the first factorial number 
    # 'fact' greater than or 
    # equal to 'low' 
    fact = 1
    x = 1
    while (fact < low): 
      
        fact = fact * x 
        x += 1
      
   
    # Count factorial numbers 
    # in range [low, high] 
    res = 0
    while (fact <= high): 
      
        res += 1
        fact = fact * x 
        x += 1
      
   
    # Return the count 
    return res 
  
# Driver code 
  
print("Count is ", countFact(2, 720)) 
  
# This code is contributed 
# by Anant Agarwal. 

