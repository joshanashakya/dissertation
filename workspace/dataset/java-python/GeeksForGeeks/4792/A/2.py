

# Python3 implementation to 
# find Average of sum of 
# first n natural even 
# number 
  
# Function to find average 
# of sum of first n even 
# numbers 
def avg_of_even_num(n): 
      
    # sum of first n even 
    # numbers 
    sum=0
    for i in range(1, n + 1): 
        sum=sum + 2 * i 
      
    # calculating Average  
    return sum / n 
  
n=9
print(avg_of_even_num(n)) 
  
# This code is contributed by upendra singh bartwal 

