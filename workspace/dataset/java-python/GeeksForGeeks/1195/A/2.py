

# Python3 implementation of the approach  
  
# Function to check if  
# the given number is a  
# factorial of any number  
def isFactorial(n) : 
    i = 1; 
    while(True) : 
          
        if (n % i == 0) : 
            n //= i; 
              
        else : 
            break;  
              
        i += 1; 
  
    if (n == 1) : 
        return True;  
      
    else : 
        return False;  
  
# Driver Code  
if __name__ == "__main__" :  
    n = 24;  
    ans = isFactorial(n);  
      
    if (ans == 1) : 
        print("Yes");  
  
    else : 
        print("No");  
  
# This code is contributed by kanugargng 

