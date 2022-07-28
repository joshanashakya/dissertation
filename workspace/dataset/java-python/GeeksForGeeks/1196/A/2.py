

# Python3 implementation of above approach 
  
# Function to delete nth digit 
# from starting 
import math; 
def deleteFromStart(num, n): 
  
    # Get the number of digits 
    d = (math.log10(num) + 1); 
  
    # Declare a variable to form  
    # the reverse resultant number 
    rev_new_num = 0; 
  
    # Loop with the number 
    i = 0; 
    while (num != 0): 
  
        digit = num % 10; 
        num = int(num / 10); 
  
        if (i != (int(d) - n)): 
            rev_new_num = ((rev_new_num * 10) +
                                        digit); 
        i += 1; 
  
    # Declare a variable to form the 
    # resultant number 
    new_num = 0; 
  
    # Loop with the number 
    i = 0; 
    while (rev_new_num != 0): 
  
        new_num = ((new_num * 10) + 
                   (rev_new_num % 10)); 
        rev_new_num = int(rev_new_num / 10); 
        i += 1; 
  
    # Return the resultant number 
    return new_num; 
  
# Function to delete nth digit 
# from ending 
def deleteFromEnd(num, n): 
  
    # Declare a variable to form  
    # the reverse resultant number 
    rev_new_num = 0; 
  
    # Loop with the number 
    i = 1; 
    while (num != 0): 
  
        digit = num % 10; 
        num = int(num / 10); 
  
        if (i != n): 
            rev_new_num = ((rev_new_num * 10) +
                                        digit); 
        i += 1; 
  
    # Declare a variable 
    # to form the resultant number 
    new_num = 0; 
  
    # Loop with the number 
    i = 0; 
    while (rev_new_num != 0): 
  
        new_num = ((new_num * 10) + 
                   (rev_new_num % 10)); 
        rev_new_num = int(rev_new_num / 10); 
        i += 1; 
  
    # Return the resultant number 
    return new_num; 
  
# Driver code 
# Get the number 
num = 1234; 
print("Number:", num); 
  
# Get the digit number to be deleted 
n = 3; 
print("Digit to be deleted:", n); 
  
# Remove the nth digit from starting 
print("Number after", n,  
      "digit deleted from starting:",  
            deleteFromStart(num, n)); 
  
# Remove the nth digit from ending 
print("Number after", n,  
      "digit deleted from ending:",  
            deleteFromEnd(num, n)); 
  
# This code is contributed by chandan_jnu 

