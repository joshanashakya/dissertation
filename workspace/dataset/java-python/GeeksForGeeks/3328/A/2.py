

# Python3 program to print  
# sorted distinct elements. 
  
def printRepeating(arr,size): 
  
    # Create a set using array elements  
    s = set() 
    for i in range(size): 
        if arr[i] not in s: 
            s.add(arr[i]) 
  
    # Print contents of the set. 
    for i in s: 
        print(i,end=" ") 
  
# Driver code 
if __name__=='__main__': 
    arr = [1,3,2,2,1] 
    size = len(arr) 
    printRepeating(arr,size) 
  
# This code is contributed by  
# Shrikant13 

