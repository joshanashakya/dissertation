

# Python Program to count number of elements between 
# two given elements. 
  
# Function to count number of elements 
# occurs between the elements. 
def getCount(arr, n, num1, num2): 
      
    # Find num1 
    for i in range(0,n): 
        if (arr[i] == num1): 
            break
              
    #If num1 is not present or present at end 
    if (i >= n-1): 
        return 0
  
    # Find num2 
    for j in range(n-1, i+1, -1): 
        if (arr[j] == num2): 
            break
  
    # If num2 is not present 
    if (j == i): 
        return 0
  
    # return number of elements between 
    # the two elements. 
    return (j - i - 1) 
  
# Driver Code 
arr= [ 3, 5, 7, 6, 4, 9, 12, 4, 8 ] 
n=len(arr) 
num1 = 5
num2 = 4
print(getCount(arr, n, num1, num2)) 
  
# This code is contributed by SHARIQ_JMI 

