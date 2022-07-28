

# Python3 implementation of the approach 
  
# Function to decide the winner 
def decideWinner(a, n): 
    count0 = 0
    count1 = 0
    count2 = 0
    count3 = 0
  
    # Iterate for all numbers in the array 
    for i in range(n): 
  
        # Condition to count 
  
        # If mod gives 0 
        if (a[i] % 4 == 0): 
            count0 += 1
  
        # If mod gives 1 
        elif (a[i] % 4 == 1): 
            count1 += 1
  
        # If mod gives 2 
        elif (a[i] % 4 == 2): 
            count2 += 1
  
        # If mod gives 3 
        elif (a[i] % 4 == 3): 
            count3 += 1
      
    # Check the winning condition for X 
    if (count0 % 2 == 0 and count1 % 2 == 0 and 
        count2 % 2 == 0 and count3 == 0): 
        return 1
    else: 
        return 2
  
# Driver code 
a = [4, 8, 5, 9] 
n = len(a) 
if (decideWinner(a, n) == 1): 
    print("X wins") 
else: 
    print("Y wins") 
  
# This code is contributed by mohit kumar 

