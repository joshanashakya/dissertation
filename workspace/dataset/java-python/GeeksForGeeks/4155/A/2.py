

# Python 3 program to print a  
# string in reverse alphabetical  
# order upto given number 
  
# Function that prints the 
# required string 
def printString(n, str): 
  
    str2 = "" 
  
    # Find modulus with 26 
    extraChar = n % 26
  
    # Print extra characters required 
    if (extraChar >= 1) : 
        for i in range( 26 - (extraChar + 1), 26): 
            str2 += str[i] 
  
    countOfStr = n // 26
  
    # Print the given reverse  
    # string countOfStr times 
    for i in range(1, countOfStr + 1) : 
        for j in range(26): 
            str2 += str[j] 
    return str2 
  
# Driver Code 
if __name__ == "__main__": 
    n = 30
  
    # Initialize a string in  
    # reverse order 
    str = "zyxwvutsrqponmlkjihgfedcba"
  
    print(printString(n, str)) 
  
# This code is contributed  
# by ChitraNayal 

