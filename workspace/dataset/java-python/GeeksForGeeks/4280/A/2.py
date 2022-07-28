

# Python3 code to check divisibility by 3 
  
  
# Function to check the divisibility 
def check(k, d0, d1): 
  
    # Cycle 
    s = ((2 * (d0 + d1)) % 10 + 
        (4 * (d0 + d1)) % 10 + 
        (8 * (d0 + d1)) % 10 + 
        (6 * (d0 + d1)) % 10) 
  
    # no of residual terms 
    a = (k - 3) % 4
  
    # if no of residue term = 0 
    if(a == 0): 
        x = 0
  
    # if no of residue term = 1 
    elif(a == 1): 
        x = (2 * (d0 + d1)) % 10
  
    # if no of residue term = 2 
    elif(a == 2): 
        x = ((2 * (d0 + d1)) % 10 + 
            (4 * (d0 + d1)) % 10) 
  
    # if no of residue term = 3 
    elif(a == 3): 
        x = ((2 * (d0 + d1)) % 10 + 
            (4 * (d0 + d1)) % 10 + 
            (8 * (d0 + d1)) % 10) 
  
    # sum of all digits 
    sum = d0 + d1 + ((k - 3) // 4) * s + x 
  
    # divisibility check 
    if(sum % 3 == 0): 
        return "YES"
    else: 
        return "NO"
  
  
# Driver code 
if __name__=='__main__': 
    k = 13
    d0 = 8
    d1 = 1
  
    print(check(k, d0, d1)) 
  
    k = 5
    d0 = 3
    d1 = 4
  
    print(check(k, d0, d1)) 
  
# This code is contributed by 
# Sanjit_Prasad 

