

# Python3 program to validate a number 
  
# Function to validate number (Check if  
# frequency of a digit is less than the 
# digit itself or not) 
def validate(n): 
  
    for i in range(10): 
        temp = n;  
        count = 0; 
        while (temp): 
              
            # If current digit of temp is  
            # same as i 
            if (temp % 10 == i): 
                count+=1; 
  
            # if frequency is greater than  
            # digit value, return false 
            if (count > i): 
                return -1; 
  
            temp //= 10; 
  
    return 1; 
  
# Driver Code 
n = 1552793; 
geek = "True" if validate(n) else "False"; 
print(geek); 
  
# This code is contributed by mits 

