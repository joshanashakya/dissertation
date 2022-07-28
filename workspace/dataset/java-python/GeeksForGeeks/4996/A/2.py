

# Python 3 program to replace space with - 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Get the String 
    str = "A computer science portal for geeks"
      
    # Traverse the string character by character. 
    for i in range(0, len(str), 1): 
          
        # Changing the ith character 
        # to '-' if it's a space. 
        if (str[i] == ' '): 
            str = str.replace(str[i], '-') 
              
    # Print the modified string. 
    print(str) 
      
# This code is contributed by 
# Surendra_Gangwar 

