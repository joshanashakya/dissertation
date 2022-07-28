

# Python code to find the count of words  
# in a CamelCase sequence  
  
# Function to find the count of words  
# in a CamelCase sequence  
def countWords(str): 
    count = 1
    for i in range(1, len(str) - 1):  
        if (str[i].isupper()):  
            count += 1
  
    return count 
  
# Driver code  
str = "geeksForGeeks";  
print(countWords(str))  
  
# This code is contributed  
# by sahishelangia 

