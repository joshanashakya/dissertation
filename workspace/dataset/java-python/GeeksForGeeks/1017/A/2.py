

# Python 3 program to find minimum number 
# of elements needs to add to the  
# array so that its median equals x. 
  
# Returns count of elements to be added   
# to make median x. This function 
# assumes that a[] has enough extra space. 
def minNumber(a, n, x): 
      
    # to sort the array in increasing order. 
    a.sort(reverse = False) 
    k = 0
    while(a[int((n - 1) / 2)] != x): 
        a[n - 1] = x 
        n += 1
        a.sort(reverse = False) 
        k += 1
  
    return k 
  
# Driver code 
if __name__ == '__main__': 
    x = 10
    a = [10, 20, 30] 
    n = 3
    print(minNumber(a, n, x)) 
  
# This code is contributed by 
# Surendra_Gangwar 

