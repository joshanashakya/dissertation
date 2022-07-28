

# Python3 program to print even length binary sequences 
# whose sum of first and second half bits is same 
  
# Function to print even length binary sequences 
# whose sum of first and second half bits is same 
  
# diff --> difference between sums of first n bits 
# and last n bits 
# out --> output array 
# start --> starting index 
# end --> ending index 
def findAllSequences(diff, out, start, end): 
  
    # We can't cover difference of more than n with 2n bits 
    if (abs(diff) > (end - start + 1) // 2): 
        return; 
  
    # if all bits are filled 
    if (start > end): 
        # if sum of first n bits and last n bits are same 
        if (diff == 0): 
            print(''.join(list(out)),end=" "); 
        return; 
  
    # fill first bit as 0 and last bit as 1 
    out[start] = '0'; 
    out[end] = '1'; 
    findAllSequences(diff + 1, out, start + 1, end - 1); 
  
    # fill first and last bits as 1 
    out[start] = out[end] = '1'; 
    findAllSequences(diff, out, start + 1, end - 1); 
  
    # fill first and last bits as 0 
    out[start] = out[end] = '0'; 
    findAllSequences(diff, out, start + 1, end - 1); 
  
    # fill first bit as 1 and last bit as 0 
    out[start] = '1'; 
    out[end] = '0'; 
    findAllSequences(diff - 1, out, start + 1, end - 1); 
  
# Driver program 
  
# input number 
n = 2; 
  
# allocate string contaning 2*n characters 
out=[""]*(2*n); 
  
findAllSequences(0, out, 0, 2*n - 1); 
  
# This code is contributed by mits 

