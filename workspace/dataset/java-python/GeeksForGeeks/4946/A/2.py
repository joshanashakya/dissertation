

# Python3 code for counting minimum  
# de-arrangements present in an array. 
  
# function to count Dearrangement 
def countDe(arr, n): 
  
        i = 0
  
        # create a copy of  
        # original array 
        v = arr.copy() 
              
        # sort the array 
        arr.sort() 
      
        # traverse sorted array for  
        # counting mismatches 
        count1 = 0
        i = 0
        while( i < n ):  
            if (arr[i] != v[i]): 
                count1 = count1 + 1
            i = i + 1
      
        # reverse the sorted array 
        arr.sort(reverse=True) 
  
        # traverse reverse sorted array  
        # for counting mismatches 
        count2 = 0
        i = 0
        while( i < n ): 
            if (arr[i] != v[i]):      
                count2 = count2 + 1
            i = i + 1
  
        # return minimum mismatch count 
        return (min (count1, count2)) 
  
# Driven code 
arr = [5, 9, 21, 17, 13] 
n = 5
print ("Minimum Dearrangement =",countDe(arr, n)) 
  
# This code is contributed by "rishabh_jain". 

