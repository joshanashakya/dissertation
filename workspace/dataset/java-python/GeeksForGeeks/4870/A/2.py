

# Python3 implementation of the approach  
  
# Function to print strictly increasing and 
# strictly decreasing sequence if possible 
def Find_Sequence(array, n): 
  
    # Arrays to store strictly increasing and 
    # decreasing sequence  
    inc_arr, dec_arr =[], [] 
  
    # Initializing last element of both sequence 
    inc, dec = -1, 1e7
  
    # Iterating through the array 
    for i in range(n): 
  
        # If current element can be appended  
        # to both the sequences 
        if inc < array[i] < dec: 
  
            # If next element is greater than  
            # the current element  
            # Then append it to the strictly  
            # increasing array  
            if array[i] < array[i + 1]: 
                inc = array[i] 
                inc_arr.append(array[i]) 
  
            # Otherwise append it to the  
            # strictly decreasing array 
            else: 
                dec = array[i] 
                dec_arr.append(array[i]) 
  
        # If current element can be appended  
        # to the increasing sequence only 
        elif inc < array[i]: 
            inc = array[i] 
            inc_arr.append(array[i]) 
  
        # If current element can be appended  
        # to the decreasing sequence only 
        elif dec > array[i]: 
            dec = array[i] 
            dec_arr.append(array[i]) 
  
        # Else we can not make such sequences  
        # from the given array 
        else: 
            print('-1') 
            break
  
    # Print the required sequences 
    else: 
        print(inc_arr, dec_arr) 
  
# Driver code 
arr = [5, 1, 3, 6, 8, 2, 9, 0, 10] 
n = len(arr) 
Find_Sequence(arr, n) 

