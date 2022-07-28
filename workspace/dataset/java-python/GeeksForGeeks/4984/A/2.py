

# Python program to print all  
# triplets in given array  
# that form Arithmetic  
# Progression 
  
# Function to print 
# all triplets in 
# given sorted array  
# that forms AP 
def printAllAPTriplets(arr, n) : 
  
    s = []; 
    for i in range(0, n - 1) : 
      
        for j in range(i + 1, n) : 
          
            # Use hash to find if 
            # there is a previous  
            # element with difference 
            # equal to arr[j] - arr[i] 
            diff = arr[j] - arr[i]; 
  
            if ((arr[i] - diff) in arr) : 
                print ("{} {} {}" .  
                        format((arr[i] - diff), 
                                arr[i], arr[j]),  
                                    end = "\n"); 
          
    s.append(arr[i]); 
      
# Driver code 
arr = [2, 6, 9, 12, 17,  
       22, 31, 32, 35, 42]; 
n = len(arr); 
printAllAPTriplets(arr, n); 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

