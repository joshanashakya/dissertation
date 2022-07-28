

# Python3 program to find number of permutations 
# such that sum of elements at odd index  
# and even index are equal 
  
def next_permutation(arr): 
  
    arrCount = len(arr); 
      
    # the head of the suffix 
    i = arrCount - 1; 
      
    # find longest suffix 
    while (i > 0 and arr[i] <= arr[i - 1]): 
        i-=1; 
      
    # are we at the last permutation already? 
    if (i <= 0): 
        return [False,arr]; 
      
    # get the pivot 
    pivotIndex = i - 1; 
      
    # find rightmost element that exceeds the pivot 
    j = arrCount - 1; 
    while (arr[j] <= arr[pivotIndex]): 
        j-=1; 
          
    # swap the pivot with j 
    temp = arr[pivotIndex]; 
    arr[pivotIndex] = arr[j]; 
    arr[j] = temp; 
      
    # reverse the suffix 
    j = arrCount - 1; 
    while (i < j): 
            temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
            i+=1; 
            j-=1; 
  
    return [True,arr]; 
  
# Function that returns the number  
# of permutations 
def numberOfPermutations(a, n): 
  
    sumEven=0; 
    sumOdd=0; 
    c = 0; 
  
    # iterate for all permutations 
    while (True):  
          
        # stores the sum of odd and  
        # even index elements 
        sumEven = 0; 
        sumOdd = 0; 
  
        # iterate for elements in permutation 
        for i in range(n): 
  
            # if odd index 
            if (i % 2): 
                sumOdd += a[i]; 
            else: 
                sumEven += a[i]; 
  
        # If condition holds 
        if (sumOdd == sumEven): 
            c+=1; 
        xx=next_permutation(a); 
        if(xx[0]==False): 
            break; 
        a=xx[1]; 
  
    # return the number of permutations 
    return c; 
  
# Driver Code 
a = [1, 2, 3]; 
n = len(a); 
  
# Calling Function 
print(numberOfPermutations(a, n)); 
  
# This code is contributed by mits 

