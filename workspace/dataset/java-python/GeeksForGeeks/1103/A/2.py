

# Python3 program to find remainder of 
# a large number when divided by 7. 
  
# Function which return Remainder 
# after dividing the number by 7  
def remainderWith7(num): 
      
    # This series is used to 
    # find remainder with 7 
    series = [1, 3, 2, -1, -3, -2]; 
      
    # Index of next element 
    # in series 
    series_index = 0; 
      
    # Initialize result 
    result = 0; 
      
    # Traverse num from end 
    for i in range((len(num) - 1), -1, -1): 
          
        # Find current digit of num 
        digit = ord(num[i]) - 48; 
          
        # Add next term to result 
        result += digit * series[series_index]; 
          
        # Move to next term in series 
        series_index = (series_index + 1) % 6; 
          
        # Make sure that result 
        # never goes beyond 7. 
        result %= 7; 
      
    # Make sure that remainder 
    # is positive 
      
    if (result < 0): 
        result = (result + 7) % 7; 
    return result; 
  
# Driver Code 
str = "12345"; 
print("Remainder with 7 is", 
       remainderWith7(str)); 
  
# This code is contributed by mits 

