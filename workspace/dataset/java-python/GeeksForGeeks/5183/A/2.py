

# Python3 implementation of 
# above approach  
  
# Function to check if 1 is  
# the majority element or not  
def majority(a, p, q, size) : 
  
    # assuming starting and  
    # ending index of 1st subarray  
    start = 0
    ends = q  
  
    # to store arr = [] 
    arr = [None] * p 
      
    # subarrays each of size q  
    k = 0
      
    # Loop to calculate total number  
    # of 1's in subarray which  
    # will get stored in array arr 
    while (k < p):  
        one = 0
        for j in range(start, ends):  
            if (a[j] == 1):  
                one = one + 1
              
        # starting index of  
        # next subarray  
        start = ends  
  
        # ending index of next 
        # subarray  
        ends = ends + q  
  
        # storing 1's  
        arr[k] = one 
        k = k + 1
      
    start = 0
    ends = q  
  
    # variable to keep a check  
    # if 1 is in majority or not  
    found = 0
  
    # In this case, we are  
    # repeating the task of  
    # calculating total number 
    # of 1's backward  
    while (ends > 0) :  
  
        # to store the total  
        # number of 1's  
        dist_one = 0
   
        # Check if 1 is in majority  
        # in this subarray  
        for i in range(0, p): 
            if (arr[i] > q / 2):  
                dist_one = dist_one + 1
  
        # If 1 is in majority return  
        if (dist_one > p / 2) : 
            found = 1
            print("Yes")  
            return
  
        # shifting starting index of  
        # subarray by 1 unit leftwards  
        start = start - 1
  
        # shifting ending index  
        # of subarray by 1 unit  
        # leftwards  
        ends = ends - 1
  
        # to ensure it is a valid  
        # index( array is circular) -1 
        # index means last index of 
        # a circular array  
        if (start < 0): 
            start = size + start 
  
        st = start 
        en = ends 
        l = 0
  
        # now to track changes occur  
        # due to shifting of the  
        # subarray  
        while (en < size) : 
  
            if (a[st % size] != a[en % size]) : 
  
                # st refers to starting index of  
                # new subarray and en refers to  
                # last element of same subarray  
                # but in previous iteration  
                if (a[st % size] == 1): 
                    arr[l] = arr[l] + 1
  
                else: 
                    arr[l] = arr[l] - 1
              
            l = l + 1
  
            # now repeating the same  
            # for other subarrays too  
            st = (st + q)  
            en = en + q  
          
    if (found == 0) :  
        print("No")  
      
# Driver code  
p = 3
q = 3
n = p * q 
  
a = [ 0, 0, 1, 1, 0, 1, 1, 0, 0 ]  
  
# circular array of given size  
majority(a, p, q, n) 
  
# This code is contributed 
# by Yatin Gupta 

