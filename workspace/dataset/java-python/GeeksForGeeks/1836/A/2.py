

# Python 3 program to find the maximum  
# number of contiguous array elements  
# with same number of set bits 
  
# Function to find maximum contiguous 
# elements with same set bits 
def sameSetBits(arr, n): 
    v = [] 
  
    # Insert number of set bits in each  
    # element of the array to the vector 
      
    # function returns the number of set  
    # bits in an integer  
    for i in range(0, n, 1): 
        v.append(bin(arr[i]).count('1')) 
  
    current_count = 1
    max_count = 1
  
    # Finding the maximum number of same 
    # contiguous elements 
    for i in range(1, len(v) - 1, 1): 
        if (v[i + 1] == v[i]): 
            current_count += 1
        else: 
            current_count = 1
  
        max_count = max(max_count,  
                        current_count) 
      
    # return answer 
    return max_count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [9, 75, 14, 7, 13, 11] 
    n = len(arr) 
  
    print(sameSetBits(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

