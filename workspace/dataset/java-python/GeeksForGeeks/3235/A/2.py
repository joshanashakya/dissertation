

# Python3 program to find  
# number formed by  
# corner digits of powers. 
   
# Storing N raised to power 0 
power = [] 
  
# Find next power by multiplying  
# N with current power 
def nextPower(N) : 
    global power 
    carry = 0
    
    for i in range(0, len(power)) : 
        prod = (power[i] * N) + carry  
    
        # Store digits of  
        # Power one by one. 
        power[i] = prod % 10 
    
        # Calculate carry. 
        carry = (int)(prod / 10)  
    
    while (carry) : 
  
        # Store carry in Power array. 
        power.append(carry % 10) 
        carry = (int)(carry / 10)  
    
# Prints number formed by corner  
# digits of powers of N. 
def printPowerNumber(X, N) : 
    global power 
    power.append(1) 
    
    # Initializing empty result 
    res = [] 
    
    # One by one compute next powers  
    # and add their corner digits. 
    for i in range(1, X+1) : 
  
        # Call Fucntion that store  
        # power in Power array. 
        nextPower(N)  
    
        # Store unit and last  
        # digits of power in res. 
        res.append(power[-1]) 
        res.append(power[0]) 
    
    for i in range(0, len(res)) : 
        print (res[i], end="")  
    
# Driver Code 
N = 19 
X = 4
printPowerNumber(X, N) 
    
# This code is contributed by  
# Manish Shaw(manishshaw1) 

