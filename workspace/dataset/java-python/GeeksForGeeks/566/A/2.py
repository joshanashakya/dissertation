

# Python 3 program to check if  
# Decimal representation of an 
# Octal number is divisible by  
# 7 or not 
  
# Function to check Divisibility 
def check(n): 
  
    sum = 0
  
    # Sum of all individual digits 
    while n != 0 : 
        sum += n % 10
        n = n // 10
  
    # Condition 
    if sum % 7 == 0 : 
        return 1
    else: 
        return 0
  
# Driver Code 
if __name__ == "__main__": 
    # Octal number 
    n = 25
  
    print(("YES") if check(n) == 1 
                  else print("NO")) 
  
# This code is contributed 
# by ChitraNayal 

