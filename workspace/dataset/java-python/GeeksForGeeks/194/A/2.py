

# Python3 program to replace 
# a digit with other 
# in a given number. 
  
def replaceDigit(x, d1, d2): 
    result = 0;  
    multiply = 1; 
  
    while (x % 10 > 0):  
  
        # Take remainder of number  
        # starting from the unit  
        # place digit 
        remainder = x % 10; 
  
        # check whether it is  
        # equal to the digit  
        # to be replaced.if yes 
        # then replace 
        if (remainder == d1):  
            result = (result + d2 * 
                         multiply);  
          
        else: # else remain as such 
            result = (result + remainder * 
                               multiply);  
  
        # Update and move forward  
        # from unit place to hundred  
        # place and so on. 
        multiply *= 10; 
        x = int(x / 10); # update the value 
  
    return result; 
  
# Driver code 
x = 645;  
d1 = 6;  
d2 = 5; 
print(replaceDigit(x, d1, d2)); 
  
# This Code is contributed  
# by mits 

