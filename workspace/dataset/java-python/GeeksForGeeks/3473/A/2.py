

# Python 3 implementation of the  
# above approach 
  
# Function to count the words 
def CountWords(str, k): 
  
    # Sum of ascii values 
    sum = 0
  
    NumberOfWords = 0
  
    # Number of words having 
    # sum of ascii less than k 
    counter = 0
  
    l = len(str) 
  
    for i in range(l): 
          
        # If character is a space 
        if (str[i] == ' ') : 
            if (sum < k): 
                counter += 1
  
            sum = 0
            NumberOfWords += 1
          
        else: 
              
            # Add the ascii value to sum 
            sum += ord(str[i]) 
  
    # Handling the Last word separately 
    NumberOfWords += 1
    if (sum < k): 
        counter += 1
  
    print("Number of words having sum of ASCII", 
          "values less than k =", counter) 
    print("Number of words having sum of ASCII values", 
                        "greater than or equal to k =",  
                               NumberOfWords - counter) 
  
# Driver code 
if __name__ == "__main__": 
      
    str = "Learn how to code"
    k = 400
    CountWords(str, k) 
  
# This code is contributed  
# by ChitraNayal 

