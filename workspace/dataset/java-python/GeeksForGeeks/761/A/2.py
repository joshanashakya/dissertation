

# Python3 program to implement  
# the above approach  
  
# Function to maximize the 
# number of pairs  
def findMaximumPairs(a, n, k) :  
  
    # Hash-table  
    hash = {};  
    for i in range(n) : 
        if a[i] % k not in hash : 
            hash[a[i] % k] = 0
          
        hash[a[i] % k] += 1
  
    count = 0;  
  
    # Iterate for all numbers less  
    # than hash values  
    for keys,values in hash.items() : 
  
        # If the number is 0  
        if (keys == 0) : 
  
            # We take half since same number  
            count += values // 2;  
            if (keys % 2 == 0) : 
                hash[keys] = 0;  
            else : 
                hash[keys] = 1;  
                  
        else : 
  
            first = keys;  
            second = k -keys;  
  
            # Check for minimal occurrence  
            if (hash[first] < hash[second]) : 
                  
                # Take the minimal  
                count += hash[first];  
  
                # Subtract the pairs used  
                hash[second] -= hash[first];  
                hash[first] = 0;  
              
            elif (hash[first] > hash[second]) :  
                  
                # Take the minimal  
                count += hash[second];  
  
                # Subtract the pairs used  
                hash[first] -= hash[second];  
                hash[second] = 0;  
              
            else : 
                  
                # Check if numbers are same  
                if (first == second) : 
  
                    # If same then number of pairs  
                    # will be half  
                    count += values // 2;  
  
                    # Check for remaining  
                    if (keys % 2 == 0) : 
                        hash[keys] = 0;  
                    else : 
                        hash[keys] = 1;  
                  
                else : 
  
                    # Store the number of pairs  
                    count += hash[first];  
                    hash[first] = 0;  
                    hash[second] = 0;  
                      
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    a = [ 1, 2, 2, 3, 2, 4, 10 ];  
    n = len(a) 
    k = 2;  
    print(findMaximumPairs(a, n, k));  
  
# This code is contributed by Ryuga 

