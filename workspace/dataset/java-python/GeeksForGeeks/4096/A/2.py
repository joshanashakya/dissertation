

# Python 3 program to check if size of  
# string is appended at the end or not. 
  
# Function to find if given number  
# is equal to length or not 
def isequal(str): 
  
    n = len(str) 
  
    # Traverse string from end and  
    # find the number stored at the end. 
    # x is used to store power of 10. 
    num = 0
    x = 1
    i = n - 1
    for i in range(n - 1, -1,-1) : 
        if ('0' <= str[i] and str[i] <= '9') : 
            num = (ord(str[i]) - ord('0')) * x + num 
            x = x * 10
            if (num>=n): 
                return false 
      
        else: 
            break
  
    # Check if number is equal to string  
    # length except that number's digits 
    return num == i + 1
  
# Driver Code 
if __name__ == "__main__": 
      
    str = "geeksforgeeks13"
    print("Yes") if isequal(str) else print("No") 
  
# This code is contributed by ChitraNayal 

