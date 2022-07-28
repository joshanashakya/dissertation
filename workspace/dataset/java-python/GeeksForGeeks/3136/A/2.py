

# Python3 Program to reverse a string  
# without using temp variable 
  
# Function to reverse string and  
# return reversed string 
def reversingString(str, start, end): 
      
    # Iterate loop upto start not equal to end 
    while (start < end): 
  
        # XOR for swapping the variable 
        str = (str[:start] + chr(ord(str[start]) ^  
                                 ord(str[end])) + 
                                 str[start + 1:]); 
        str = (str[:end] + chr(ord(str[start]) ^  
                               ord(str[end])) + 
                               str[end + 1:]); 
        str = (str[:start] + chr(ord(str[start]) ^  
                                 ord(str[end])) + 
                                 str[start + 1:]); 
  
        start += 1; 
        end -= 1; 
    return str; 
  
# Driver Code 
s = "GeeksforGeeks"; 
print(reversingString(s, 0, 12)); 
  
# This code is contributed by 29AjayKumar 

