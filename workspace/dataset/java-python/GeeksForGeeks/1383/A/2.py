

# Python 3 program to find number of ways 
# in which number expressed as 
# product of two different factors 
  
# To count number of ways in which 
# number expressed as product 
# of two different numbers 
def countWays(n): 
      
    # To store count of such pairs 
    count = 0
    i = 1
      
    # Counting number of pairs 
    # upto sqrt(n) - 1 
    while ((i * i)<n) :  
        if(n % i == 0): 
            count += 1    
        i += 1
          
    # To return count of pairs 
    return count 
  
# Driver program to test countWays() 
n = 12
print (countWays(n)) 
  
# This code is contributed 
# by Azkia Anam. 

