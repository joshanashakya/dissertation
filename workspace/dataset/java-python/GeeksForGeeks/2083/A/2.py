

# Python3 implmentation to convert  
# a number into odd number such  
# that digit-sum is odd  
  
# Function to convert a number into  
# odd number such that digit-sum is odd  
def converthenumber(n) : 
    s = str(n); 
    res = ""; 
      
    # Loop to find any first two 
    # odd number such that their 
    # sum is even and number is odd 
    for i in range(len(s)) : 
        if (s[i] == '1' or s[i] == '3'
        or s[i] == '5' or s[i] == '7'
        or s[i] == '9') : 
            res += s[i]; 
              
        if (len(res) == 2) : 
            break; 
              
    # Print the result 
    if (len(res) == 2) : 
        print(res); 
          
    else : 
        print("-1");  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 18720;  
    converthenumber(n);  
  
# This code is contributed by AnkitRai01 

