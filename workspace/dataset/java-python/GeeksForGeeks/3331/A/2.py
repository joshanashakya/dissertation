

# Efficient Python program to print all non- 
# repeating elements. 
  
def firstNonRepeating(arr, n): 
      
    # Insert all array elements in hash 
    # table 
    mp={} 
    for i in range(n): 
        if arr[i] not in mp: 
            mp[arr[i]]=0
        mp[arr[i]]+=1
          
    # Traverse through map only and 
    for x in mp: 
        if (mp[x]== 1): 
            print(x,end=" ") 
              
# Driver code 
arr = [ 9, 4, 9, 6, 7, 4 ] 
n = len(arr) 
firstNonRepeating(arr, n) 
   
# This code is contributed by shivanisinghss2110 

