

# Python3 code for the above implementation 
import sys 
  
# Make the largest even number 
def makeEven(arr, n): 
      
    # index to first even no,if any 
    first_e_i = -1
      
    # index to last even no, if any 
    last_e_i = -1
      
    # index to last no 
    last_n_i = n - 1
  
    # Start traversing the String  
    for i in range(n): 
  
        # if it finds any first even no less  
        # than last digit then break the loop 
        if (int(arr[i]) % 2 == 0 and 
            int(arr[i]) < int(arr[last_n_i])): 
            first_e_i = i 
            break
              
        # it finds last even no 
        if int(arr[i]) % 2 == 0: 
            last_e_i = i 
    if first_e_i != -1: 
          
        # swap even and odd value 
        (arr[first_e_i],  
         arr[last_n_i]) = (arr[last_n_i],  
                           arr[first_e_i]) 
        return arr 
    if first_e_i == -1 and last_e_i != -1: 
          
        # swap even and odd value 
        (arr[last_e_i],  
         arr[last_n_i]) = (arr[last_n_i],  
                           arr[last_e_i]) 
        return arr 
          
    # Return original String if there is  
    # no even number 
    return arr      
  
# Driver Code 
if __name__=='__main__': 
    string="1356425"
    result = "".join(makeEven(list(string), 
                          len(list(string)))) 
    print(result) 
   
# This code is contributed 
# by Vikash Kumar 37 

