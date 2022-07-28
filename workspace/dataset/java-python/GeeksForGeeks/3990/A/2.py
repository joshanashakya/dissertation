

# Python 3 program for count  
# total zero in product of array 
  
# Returns count of zeros  
# in product of array 
def countZeros(a, n) : 
    count2 = 0
    count5 = 0
    for i in range(0, n) : 
          
        # count number of 2s  
        # in each element 
        while (a[i] % 2 == 0) : 
            a[i] = a[i] // 2
            count2 = count2 + 1
          
          
        # count number of 5s  
        # in each element 
        while (a[i] % 5 == 0) : 
            a[i] = a[i] // 5
            count5 = count5 + 1
          
          
    # return the minimum 
    if(count2 < count5) : 
        return count2 
    else :  
        return count5 
          
  
# Driven Program 
a = [ 10, 100, 20, 30, 50, 90, 12, 80 ] 
n = len(a) 
print(countZeros(a, n)) 
  
# This code is contributed  
# by Nikita Tiwari. 

