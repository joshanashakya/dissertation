

# Python3 program to print the  
# number of 1s in smallest 
# repunit multiple of the number. 
  
# Function to find number  
# of 1s in smallest repunit 
# multiple of the number 
def countOnes(n): 
      
    # to store number of 1s  
    # in smallest repunit 
    # multiple of the number. 
    count = 1; 
  
    # initialize rem with 1 
    rem = 1; 
  
    # run loop until  
    # rem becomes zero 
    while (rem != 0): 
  
        # rem*10 + 1 here represents 
        # the repunit modulo n 
        rem = (rem * 10 + 1) % n; 
        count = count + 1; 
  
    # when remainder becomes 
    # 0 return count 
    return count; 
  
# Driver Code 
n = 13; 
  
# Calling function 
print(countOnes(n)); 
      
# This code is contributed by mits 

