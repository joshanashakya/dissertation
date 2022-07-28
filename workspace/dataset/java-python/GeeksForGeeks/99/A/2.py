

# Python3 program to check if the array 
# with odd sum is possible 
  
# Function to check if the 
# sum of the array can be made odd. 
def isOdd(arr,  n) : 
    flag = 0; flag1 = 0; sum = 0; 
  
    # Find sum of all elements and increment 
    # check for odd or even elements in the array 
    # so that by changing ai=aj, 
    # the sum of the array can be made odd 
    for i in range(n) : 
        sum += arr[i]; 
        if (arr[i] % 2 == 0 and flag == 0) : 
            flag = 1; 
            l = arr[i]; 
          
        if (arr[i] % 2 != 0 and flag1 == 0) : 
            r = arr[i]; 
            flag1 = 1; 
  
    # If the sum is already odd 
    if (sum % 2 != 0) : 
        return True; 
  
    # Else, then both the flags should be checked. 
    # Here, flag1 and flag represent if there is 
    # an odd-even pair which can be replaced. 
    else : 
        if (flag1 == 1 and flag == 1) : 
            return True; 
        else : 
            return False; 
  
# Driver code 
if __name__ == "__main__" : 
  
    arr = [ 5, 4, 4, 5, 1, 3 ]; 
    n = len(arr); 
      
    res = isOdd(arr, n); 
  
    if (res) : 
        print("Yes"); 
    else : 
        print("No"); 
     
# This code is contributed by AnkitRai01 

