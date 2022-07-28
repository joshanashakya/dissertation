

# Python3 program to count appearances  
# of a digit 'd' in range from [0..n]  
import math; 
def getOccurence(n, d):  
      
    # Initialize result  
    result = 0;  
  
    # Count appearances in numbers  
    # starting from d.  
    itr = d;  
    while(itr <= n):  
          
        # When the last digit is equal to d  
        if (itr % 10 == d):  
            result += 1;  
  
        # When the first digit is equal to d then  
        if (itr != 0 and math.floor(itr / 10) == d): 
              
            # increment result as well as number  
            result += 1;  
            itr += 1;  
  
        # In case of reverse of number  
        # such as 12 and 21  
        elif (math.floor(itr / 10) == d - 1):  
            itr = itr + (10 - d);  
        else: 
            itr = itr + 10;  
  
    return result;  
  
# Driver code  
n = 11;  
d = 1;  
print(getOccurence(n, d));  
  
# This code is contributed by mits 

