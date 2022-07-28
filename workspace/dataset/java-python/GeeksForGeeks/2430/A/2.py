

# Python 3 program to find the sum of numbers 
# divisible by M in the given range 
  
# Function to find the sum of numbers 
# divisible by M in the given range 
def sumDivisibles(A, B, M): 
  
    # Variable to store the sum 
    sum = 0
  
    # Running a loop from A to B and check 
    # if a number is divisible by i. 
    for i in range(A, B + 1): 
  
        # If the number is divisible, 
        # then add it to sum 
        if (i % M == 0): 
            sum += i 
  
    # Return the sum 
    return sum
  
# Driver code 
if __name__=="__main__": 
      
    # A and B define the range 
    # M is the dividend 
    A = 6
    B = 15
    M = 3
  
    # Printing the result 
    print(sumDivisibles(A, B, M)) 
      
# This code is contributed by chitranayal 

