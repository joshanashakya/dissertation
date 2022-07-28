

# Python3 program to sort first half in increasing 
# order and second half in decreasing 
  
# required sorting function 
def mySort( arr, n): 
      
    arr1 = arr[:n//2] 
    arr2 = arr[n//2:] 
    arr1.sort() 
    arr2.sort(reverse=True) 
    return arr1+arr2 
      
      
  
# driving function 
if __name__=='__main__': 
    arr= [5, 4, 6, 2, 1, 3, 8, 9, 7 ] 
    n = len(arr) 
    arr=mySort(arr, n) 
    print( "Modified Array : ") 
    print(arr) 
  
# this code is contributed by ash264 

