

# Simple Python3 program to convert  
# all substrings from decimal to given base. 
import math 
  
def substringConversions(s, k, b): 
      
    l = len(s); 
    for i in range(l): 
          
        if((i + k) < l + 1): 
              
            # Saving substring in sub 
            sub = s[i : i + k];      
              
            # Evaluating decimal for current  
            # substring and printing it. 
            sum, counter = 0, 0; 
            for i in range(len(sub) - 1, -1, -1): 
      
                sum = sum + ((ord(sub[i]) - ord('0')) *     
                              pow(b, counter)); 
                counter += 1; 
              
            print(sum , end = " "); 
  
# Driver code 
s = "12212"; 
b, k = 3, 3; 
substringConversions(s, b, k);  
  
# This code is contributed  
# by Princi Singh 

