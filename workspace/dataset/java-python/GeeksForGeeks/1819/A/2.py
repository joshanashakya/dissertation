

# Python 3 code to check if a Octal 
# number is Even or Odd 
  
# Check if the number is odd or even 
def even_or_odd( N): 
    l = len(N); 
  
    # Check if the last digit 
    # is either '0', '2', '4', 
    # or '6' 
    if (N[l - 1] == '0'or N[l - 1] == '2'or
        N[l - 1] == '4' or N[l - 1] == '6'): 
        return ("Even") 
    else: 
        return ("Odd") 
  
# Driver code 
N = "735"
  
print(even_or_odd(N)) 
  
# This code is contributed by ANKITKUMAR34 

