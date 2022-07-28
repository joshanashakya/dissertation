

# Python3 program to count the differences  
  
# Function to calculate the diffrence  
def Diffs(a, k):  
  
    out, inc, dec = [], [0] * len(a), [0] * len(a)  
  
    # Initializing inc and dec with 0 and  
    # resizing equal to the size of main array  
    inc_sum, dec_sum = 0, 0
  
    # Iterate through the array  
    for i in range(0, len(a)):  
  
        # Finding number of increasing  
        # subarrays in a window size k 
        j = i - 1
        while (j >= 0 and j > i - k and 
                        a[j + 1] > a[j]):  
            inc[j] += 1
            inc_sum += 1
            j -= 1
  
        # Finding number of decreasing  
        # subarrays in a window size k  
        j = i - 1
        while (j >= 0 and j > i - k and 
                        a[j + 1] < a[j]):  
            dec[j] += 1
            dec_sum += 1
            j -= 1
  
        # calculate the difference  
        if i >= k - 1:  
  
            # if this is not the first window then  
            # calculate inc_sum and dec_sum  
            if i >= k:  
                inc_sum -= inc[i - k]  
                dec_sum -= dec[i - k]  
              
            # insert the difference in k size window  
            # in the output vector  
            out.append(inc_sum - dec_sum)  
          
    return out  
  
# Driver Code 
if __name__ == "__main__":  
  
    out = Diffs([10, 20, 30, 15, 15], 3)  
    for n in out: 
        print(n, end = ", ")  
      
# This code is contributed by Rituraj Jain 

