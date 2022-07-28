

# Python 3 program to find if  
# there exist three elements in 
# Geometric Progression or not 
  
# The function prints three elements  
# in GP if exists. 
# Assumption: arr[0..n-1] is sorted. 
def findGeometricTriplets(arr, n): 
  
    # One by fix every element  
    # as middle element 
    for j in range(1, n - 1): 
      
        # Initialize i and k for  
        # the current j 
        i = j - 1
        k = j + 1
  
        # Find all i and k such that  
        # (i, j, k) forms a triplet of GP 
        while (i >= 0 and k <= n - 1): 
          
            # if arr[j]/arr[i] = r and  
            # arr[k]/arr[j] = r and r  
            # is an integer (i, j, k) forms  
            # Geometric Progression 
            while (arr[j] % arr[i] == 0 and
                   arr[k] % arr[j] == 0 and
                   arr[j] // arr[i] == arr[k] // arr[j]): 
              
                # print the triplet 
                print( arr[i] , " " , arr[j],  
                                " " , arr[k])  
  
                # Since the array is sorted and  
                # elements are distinct. 
                k += 1
                i -= 1
  
            # if arr[j] is multiple of arr[i] 
            # and arr[k] is multiple of arr[j],  
            # then arr[j] / arr[i] != arr[k] / arr[j]. 
            # We compare their values to 
            # move to next k or previous i. 
            if(arr[j] % arr[i] == 0 and
                        arr[k] % arr[j] == 0): 
              
                if(arr[j] // arr[i] < arr[k] // arr[j]): 
                    i -= 1
                else: 
                    k += 1
  
            # else if arr[j] is multiple of  
            # arr[i], then try next k. Else,  
            # try previous i. 
            elif (arr[j] % arr[i] == 0): 
                k += 1
            else: 
                i -= 1
  
# Driver code 
if __name__ =="__main__": 
      
    arr = [1, 2, 4, 16] 
    n = len(arr) 
  
    findGeometricTriplets(arr, n) 
  
# This code is contributed  
# by ChitraNayal 

