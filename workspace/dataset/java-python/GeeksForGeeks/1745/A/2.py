

# python program to find number of n  
# digit numbers that do not  
# contain 9 as it's digit 
  
# function to find number of  
# n digit numbers possible  
def totalNumber(n): 
      
    return 8 * pow(9, n - 1); 
   
# driver function 
n = 3
print(totalNumber(n)) 
  
# This code is contributed by Sam007 

