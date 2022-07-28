

# python 3 program to print all triplets in given  
# array that form Arithmetic Progression 
   
# Function to print all triplets in 
# given sorted array that forms AP 
def printAllAPTriplets(arr, n): 
   
    for i in range(1, n - 1):  
   
        # Search other two elements of 
        # AP with arr[i] as middle. 
        j = i - 1
        k = i + 1
        while(j >= 0 and k < n ):  
   
            # if a triplet is found 
            if (arr[j] + arr[k] == 2 * arr[i]):  
                print(arr[j], "", arr[i], "", arr[k]) 
   
                # Since elements are distinct, 
                # arr[k] and arr[j] cannot form 
                # any more triplets with arr[i] 
                k += 1
                j -= 1
               
   
            # If middle element is more move to  
            # higher side, else move lower side. 
            elif (arr[j] + arr[k] < 2 * arr[i]):  
                k += 1     
            else: 
                j -= 1     
           
# Driver code 
arr = [ 2, 6, 9, 12, 17,  
        22, 31, 32, 35, 42 ] 
n = len(arr)  
printAllAPTriplets(arr, n) 
   
# This article is contributed  
# by Smitha Dinesh Semwal 

