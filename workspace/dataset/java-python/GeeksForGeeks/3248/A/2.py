

# Python3 program to find the XOR  
# and OR of all Armstrong numbers  
# of N digits  
  
# Function to check if a number  
# is Armstrong or not  
def isArmstrong (x, n):  
    sum1 = 0  
    temp = x   
    while temp > 0:  
        digit = temp % 10
        sum1 += digit **n  
        temp //= 10
    return sum1 == x 
  
# Function to find XOR of all  
# N-digits Armstrong number  
def CalculateXORandOR(n) :  
  
    # To store the XOR and OR of all  
    # Armstrong number  
    CalculateXOR = 0
    CalculateOR = 0
  
    # Starting N-digit  
    # Armstrong number  
    start = 10 ** (n - 1) 
  
    # Ending N-digit  
    # Armstrong number  
    end = (10**n) - 1
    # Iterate over starting and  
    # ending number  
    for i in range( start, end + 1) :  
  
        # To check if i is  
        # Armstrong or not  
        if (isArmstrong(i, n)) :  
            CalculateXOR = CalculateXOR ^ i 
            CalculateOR = CalculateOR | i 
  
    # Print the XOR and OR of all  
    # Armstrong number  
    print("XOR = ", CalculateXOR)  
    print("OR = ", CalculateOR) 
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 4;  
    CalculateXORandOR(n);  

