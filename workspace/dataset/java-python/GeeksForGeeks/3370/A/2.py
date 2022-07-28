

# An otpimized C++ program to find pairs with 
# distance equal to English alphabet distance  
  
MAX_CHAR = 26
  
# Function to count pairs with distance  
# equal to English alphabet distance  
def countPairs(str1): 
    result = 0;  
    n = len(str1)  
  
    for i in range(0, n):  
  
        # This loop runs at most 26 times 
        for j in range(1, MAX_CHAR + 1): 
            if((i + j) < n):  
                if ((abs(ord(str1[i + j]) -
                         ord(str1[i])) == j)): 
                    result += 1;  
  
    return result  
  
# Driver code  
if __name__ == "__main__":  
    str1 = "geeksforgeeks";  
    print(countPairs(str1)) 
  
# This code is contributed 
# by Sairahul099 

