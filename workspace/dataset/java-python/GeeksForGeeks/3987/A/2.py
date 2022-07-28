

# Python 3 implementation of the approach 
  
# Function to return the number of  
# trailing zeros 
def trailing_zeros(N): 
      
    # To store the number of 2s and 5s 
    count_of_two = 0
    count_of_five = 0
  
    for i in range(1, N + 1, 1): 
        val = i 
  
        while (val % 2 == 0 and val > 0): 
            val /= 2
  
            # If we get a factor 2 then we  
            # have i number of 2s because  
            # the power of the number is  
            # raised to i 
            count_of_two += i 
  
        while (val % 5 == 0 and val > 0): 
            val /= 5
  
            # If we get a factor 5 then we 
            # have i number of 5s because  
            # the power of the number is  
            # raised to i 
            count_of_five += i 
      
    # Take the minimum of them 
    ans = min(count_of_two, count_of_five) 
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    N = 12
  
    print(trailing_zeros(N)) 
  
# This code is contributed by 
# Sanjit_Prasad 

