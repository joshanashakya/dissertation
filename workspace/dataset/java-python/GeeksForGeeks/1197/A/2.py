

# Python3 implementation to delete nth digit 
# from starting with O(1) time complexity. 
  
# function to del1ete nth number  
# from starting 
def fromStart(inp, del11):  
  
    inp1 = inp[0:del1 - 1]; 
    inp2 = inp[del1:len(inp)]; 
    return inp1 + inp2; 
  
# function to delete nth number  
# from ending 
def fromEnd(inp, del1): 
    inp1 = inp[0:len(inp) - del1]; 
    inp2 = inp[len(inp) - del1 + 1:len(inp)]; 
    return inp1 + inp2; 
  
# Driver Code 
in1 = 1234; 
  
# type cast input number to string 
inp = str(in1); 
del1 = 3; 
print("num_after_deleting_from_starting",  
                   fromStart(inp, del1)); 
print("num_after_deleting_from_ending",  
                   fromEnd(inp, del1)); 
  
# This code is contributed by chandan_jnu 

