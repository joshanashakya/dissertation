

# Python3 implementation of the approach 
  
# compute number of different bits 
def solve( A,  B): 
   
    count = 0 
  
    # since, the numbers are less than 2^31 
    # run the loop from '0' to '31' only 
    for i in range(0,32): 
  
        # right shift both the numbers by 'i' and 
        # check if the bit at the 0th position is different 
        if ((( A >>  i) & 1) != (( B >>  i) & 1)):  
             count=count+1
           
       
  
    print("Number of different bits :",count)  
   
  
# Driver code 
A = 12 
B = 15 
  
# find number of different bits 
solve( A,  B)  
  
  
# This code is contributed by ihritik 
  

