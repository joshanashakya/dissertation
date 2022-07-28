

# Python3 implementation of the approach 
  
# Function to print the required string 
def printString(Str1, n): 
  
    # count number of 1s 
    ones = 0
    for i in range(n): 
        if (Str1[i] == '1'): 
            ones += 1
  
    # To check if the all the 1s 
    # have been used or not 
    used = False
  
    for i in range(n): 
        if (Str1[i] == '2' and used == False): 
            used = 1
  
            # Print all the 1s if any 2 is encountered 
            for j in range(ones): 
                print("1", end = "") 
  
        # If Str1[i] = 0 or Str1[i] = 2 
        if (Str1[i] != '1'): 
            print(Str1[i], end = "") 
  
    # If 1s are not printed yet 
    if (used == False): 
        for j in range(ones): 
            print("1", end = "") 
  
# Driver code 
Str1 = "100210"
n = len(Str1) 
printString(Str1, n) 
  
# This code is contributed 
# by Mohit Kumar  

