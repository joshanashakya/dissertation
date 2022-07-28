

# Python implementation of above approach 
def successiveChange(arr, N): 
  
    result = 0; 
  
    var1 = arr[0]; 
    var2 = arr[1]; 
  
    # Calculate successive change of 1st 2 change 
    result = float(var1 + var2 + 
            (float(var1 * var2) / 100)); 
      
  
    # Calculate successive change 
    # for rest of the value 
    for i in range(2, N): 
        result = (result + arr[i] +
                 (float(result * arr[i]) / 100)); 
  
    return result; 
  
# Driver code 
arr = [10, 20, 30, 10]; 
N = len(arr) ; 
  
# Calling function 
result = successiveChange(arr, N); 
print ("Percentage change is = %.2f" % 
                       (result), "%"); 
  
# This code is contributed  
# by Shivi_Aggarwal 
     

