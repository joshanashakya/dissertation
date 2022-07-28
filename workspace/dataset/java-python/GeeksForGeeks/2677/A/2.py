

# Python3 program to check if  
# a large number is  
# divisible by 15 
  
# to find sum 
def accumulate(s):  
    acc = 0; 
    for i in range(len(s)): 
        acc += ord(s[i]) - 48; 
    return acc; 
  
# function to check  
# if a large number 
# is divisible by 15 
def isDivisible(s): 
    # length of string 
    n = len(s); 
  
    # check divisibility by 5 
    if (s[n - 1] != '5' and s[n - 1] != '0'): 
        return False; 
  
    # Sum of digits 
    sum = accumulate(s); 
      
    # if divisible by 3 
    return (sum % 3 == 0); 
  
  
# Driver Code 
s = "15645746327462384723984023940239"; 
if isDivisible(s): 
    print("Yes");  
else: 
    print("No"); 
  
s = "15645746327462384723984023940235"; 
if isDivisible(s): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

