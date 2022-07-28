

# Python program to count total number  
# of digits we have to write from 1 to n 
  
def totalDigits(n): 
  
    # number_of_digits store total 
    # digits we have to write 
    number_of_digits = 0; 
  
    # In the loop we are decreasing 
    # 0, 9, 99 ... from n till 
    #( n - i + 1 ) is greater than 0 
    # and sum them to number_of_digits 
    # to get the required sum 
    for i in range(1, n, 10): 
        number_of_digits = (number_of_digits + 
                                 (n - i + 1)); 
          
    return number_of_digits; 
  
  
# Driver code 
n = 13; 
s = totalDigits(n) + 1; 
print(s); 
      
# This code is contributed 
# by Shivi_Aggarwal  

