

# Python3 program to count the  
# number of occurrences of a  
# particular digit in a number 
  
# Function to count the occurrences 
# of the digit D in N 
def countOccurrances(n, d): 
    count = 0
  
    # Loop to find the digits of N 
    while (n > 0): 
  
        # check if the digit is D 
        if(n % 10 == d): 
            count = count + 1
   
        n = n // 10
  
    # return the count of the 
    # occurrences of D in N 
    return count 
  
# Driver code 
d = 2
n = 214215421
print(countOccurrances(n, d)) 
  
# This code is contributed by Mohit Kumar 

