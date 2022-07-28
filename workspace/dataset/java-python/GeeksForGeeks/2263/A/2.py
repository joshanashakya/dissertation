

# Python3 program to count all numbers  
# that can be formed using two number  
# numbers x an y 
  
# Returns count of numbers from 1  
# to n that can be formed using x and y. 
def countNums(n, x, y): 
  
    # Create an auxiliary array and  
    # initialize it as false. An  
    # entry arr[i] = True is going to 
    # mean that i can be formed using 
    # x and y 
    arr = [False for i in range(n + 2)] 
  
    # x and y can be formed using x and y. 
    if(x <= n): 
        arr[x] = True
    if(y <= n): 
        arr[y] = True
  
    # Initialize result 
    result = 0
  
    # Traverse all numbers and increment 
    # result if a number can be formed  
    # using x and y. 
    for i in range(min(x, y), n + 1): 
  
        # If i can be formed using x and y 
        if(arr[i]): 
  
            # Then i+x and i+y can also  
            # be formed using x and y. 
            if(i + x <= n): 
                arr[i + x] = True
            if(i + y <= n): 
                arr[i + y] = True
  
            # Increment result 
            result = result + 1
  
    return result 
  
# Driver code 
n = 15
x = 5
y = 7
print(countNums(n, x, y)) 
  
# This code is contributed by 
# Sanjit_Prasad 

