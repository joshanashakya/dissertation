

# Pyhton 3 program to find square of  
# these large numbers 
  
# Function to find the square of 
# 333...333, 666...666 and 999...999 
def find_Square_369(num): 
  
    # if the number is 333...333 
    if (num[0] == '3'): 
        a = '1'
        b = '0'
        c = '8'
        d = '9'
  
    # if the number is 666...666 
    elif (num[0] == '6'): 
        a = '4'
        b = '3'
        c = '5'
        d = '6'
  
    # if the number is 999...999 
    else: 
        a = '9'
        b = '8'
        c = '0'
        d = '1'
  
    # variable for hold result 
    result = "" 
  
    # find the no of digit 
    size = len(num) 
  
    # add size-1 time a in result 
    for i in range(1, size): 
        result += a 
  
    # add one time b in result 
    result += b 
  
    # add size-1 time c in result 
    for i in range(1, size): 
        result += c 
  
    # add one time d in result 
    result += d 
  
    # return result 
    return result 
  
  
# Drivers code 
# Your Python 3 Code 
  
num_3 = "3333"
num_6 = "6666"
num_9 = "9999"
  
result = "" 
  
# find square of 33..33 
result = find_Square_369(num_3) 
print("Square of " + num_3 + " is : "
                            + result); 
  
# find square of 66..66 
result = find_Square_369(num_6) 
print("Square of " + num_6 + " is : "
                            + result); 
  
# find square of 66..66 
result = find_Square_369(num_9) 
print("Square of " + num_9 + " is : "
                           + result); 
  
# This code is contributed by Smitha 

