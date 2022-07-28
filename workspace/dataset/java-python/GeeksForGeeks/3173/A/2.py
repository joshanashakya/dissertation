

# Python3 program to find the smallest  
# positive missing number  
  
# Function to find the smallest positive  
# missing number  
def missingNumber(a, n) :  
      
    # Declaring an unordered_map  
    mp = dict();  
  
    # if array value is positive  
    # store it in map  
    for i in range(n) : 
        if (a[i] > 0) : 
            if a[i] not in mp.keys() : 
                mp[a[i]] = 0
            
            mp[a[i]] += 1
  
    # index value set to 1  
    index = 1;  
  
    # Return the first value starting  
    # from 1 which does not exists in map  
    while (1) : 
        if (index not in mp.keys()) :  
            return index;  
          
  
        index += 1;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 1, 1, 0, -1, -2 ];  
    size = len(a);  
  
    print("Smallest positive missing number is : ",missingNumber(a, size));  
  
# This code is contributed by AnkitRai01 

