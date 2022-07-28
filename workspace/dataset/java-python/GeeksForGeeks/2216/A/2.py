

# Python3 implementation of the approach  
  
# Function to print the two parts  
def twoParts(string) : 
      
    flag = 0;  
    a = "";  
  
    # Find the position of 4  
    for i in range(len(string)) : 
          
        if (string[i] == '4') : 
            string[i] = '3';  
            a += '1';  
            flag = 1;  
          
        # If current character is not '4'  
        # but appears after the first  
        # occurrence of '4'  
        elif (flag) : 
            a += '0'; 
      
    string = "".join(string); 
      
    # Print both the parts  
    print(string, a);  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "9441";  
      
    twoParts(list(string));  
  
# This code is contributed by Ryuga 

