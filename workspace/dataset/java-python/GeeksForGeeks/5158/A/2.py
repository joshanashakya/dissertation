

# Python3 program to find sum of given  
# array of string type in integer form 
  
# Function to find the sum of given array 
def calculateSum(arr, n): 
  
    # if string is empty 
    if (n == 0): 
        return 0
  
    s = arr[0] 
  
    # stoi function to convert 
    # string into integer 
    value = int(s) 
    sum = value 
  
    for i in range(2 , n, 2): 
      
        s = arr[i] 
  
        # stoi function to convert  
        # string into integer 
        value = int(s) 
  
        # Find operator 
        operation = arr[i - 1][0] 
  
        # If operator is equal to '+', 
        # add value in sum variable  
        # else subtract 
        if (operation == '+'): 
            sum += value 
        else: 
            sum -= value 
      
    return sum
  
# Driver Function 
arr = ["3", "+", "4", "-","7", "+", "13"]  
n = len(arr) 
print(calculateSum(arr, n)) 
  
# This code is contributed by Smitha 

