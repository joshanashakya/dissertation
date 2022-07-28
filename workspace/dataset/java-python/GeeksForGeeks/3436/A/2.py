

# Python3 program to find exacktly m-element set 
# where differencec of any two is divisible by k 
def findSet( arr, k, m): 
  
    arr_size = len(arr); 
    remainder_set=[0]*k; 
  
    # initialize remainder set with blank array 
    for i in range(k): 
        remainder_set[i] = []; 
  
    # calculate remainder set array 
    # and push element as per their reainder 
    for i in range(arr_size): 
        rem = arr[i] % k; 
        remainder_set[rem].append(arr[i]); 
  
    # check whether sizeof any remainder set  
    # is equal or greater than m 
    for i in range(k): 
        # if size exist then print yes and all elements 
        if(len(remainder_set[i]) >= m): 
            print("Yes"); 
            for j in range(m): 
                print(remainder_set[i][j],end=""); 
                print(" ",end=""); 
  
            # return if remainder set found 
            return; 
  
    # print no if no remiander set found 
    print("No"); 
  
arr = [5, 8, 9, 12, 13, 7, 11, 15]; 
k = 4; # constant k 
m = 3; # size of set required 
findSet(arr, k, m); 
  
# This code is contributed by mits. 

