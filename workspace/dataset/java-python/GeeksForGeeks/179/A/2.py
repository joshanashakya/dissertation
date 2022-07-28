

# Python code to check if a HexaDecimal 
# number is Even or Odd 
  
# Check if the number is odd or even 
def even_or_odd(N): 
    l = len(N) 
  
    # check if the last digit 
    # is either '0', '2', '4', 
    # '6', '8', 'A'(=10), 
    # 'C'(=12) or 'E'(=14) 
    if (N[l - 1] == '0'or N[l - 1] == '2'or 
        N[l - 1] == '4'or N[l - 1] == '6'or 
        N[l - 1] == '8'or N[l - 1] == 'A'or 
        N[l - 1] == 'C'or N[l - 1] == 'E'): 
        return ("Even") 
    else: 
        return ("Odd") 
  
# Driver code 
N = "AB3454D"
  
print(even_or_odd(N)) 
  
# This code is contributed by Atul_kumar_Shrivastava 

