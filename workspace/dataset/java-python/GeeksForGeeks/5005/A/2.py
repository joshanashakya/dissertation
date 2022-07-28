

# Python3 program to find the values of 
# X and Y using the given equations 
  
# Function to find the values of X and Y 
def findValues(a, b): 
  
    # base condition 
    if ((a - b) % 2 == 1): 
        print("-1"); 
        return; 
  
    # required answer 
    print((a - b) // 2, (a + b) // 2); 
  
# Driver Code 
a = 12; b = 8; 
  
findValues(a, b); 
  
# This code is contributed 
# by Akanksha Rai 

