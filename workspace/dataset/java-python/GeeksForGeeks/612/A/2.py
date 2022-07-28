

# A space optimized 
# based Python 3  
# program to print 
# first n Tribinacci  
# numbers. 
  
def printTrib(n) : 
    if (n < 1) : 
        return
   
    # Initialize first 
    # three numbers 
    first = 0
    second = 0
    third = 1
  
    print( first , " ", end="") 
    if (n > 1) : 
        print(second, " ",end="") 
    if (n > 2) : 
        print(second, " ", end="") 
  
    # Loop to add previous 
    # three numbers for 
    # each number starting 
    # from 3 and then assign 
    # first, second, third 
    # to second, third, and curr 
    # to third respectively 
    for i in range(3, n) : 
        curr = first + second + third 
        first = second 
        second = third 
        third = curr 
  
        print(curr , " ", end="") 
      
      
# Driver code 
n = 10
printTrib(n) 
  
# This code is contributed by Nikita Tiwari. 

