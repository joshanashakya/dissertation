

# Python 3 program to check if a  
# number is formed by Concatenation  
# of 1, 14 or 144 only 
  
# Function to check if a number is formed 
# by Concatenation of 1, 14 or 144 only 
def checkNumber(N): 
    temp = N 
  
    while (temp > 0): 
          
        # check for each possible digit 
        # if given number consist other then 
        # 1, 14, 144 print NO else print YES 
        if (temp % 1000 == 144): 
            temp /= 1000
        elif (temp % 100 == 14): 
            temp /= 100
        elif (temp % 10 == 1): 
            temp /= 10
        else:  
            return "YES"
  
    return "NO"
  
# Driver Code 
N = 1414; 
  
print(checkNumber(N)); 
  
# This code is contributed  
# by Akanksha Rai 

