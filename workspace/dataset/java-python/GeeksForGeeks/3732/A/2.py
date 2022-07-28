

# Python3 implementation for above approach  
N = 100005
  
# To store the tree in lazy propagation  
lazy = [0] * (4 * N);  
  
# To store the different numbers  
se = set()  
  
# Function to update in the range [x, y) 
# with given value  
def update(x, y, value, id, l, r) : 
      
    # check out of bound  
    if (x >= r or l >= y):  
        return;  
  
    # check for complete overlap  
    if (x <= l and r <= y) :  
        lazy[id] = value;  
        return;  
  
    # find the mid number  
    mid = (l + r) // 2;  
  
    # check for pending updates  
    if (lazy[id]) : 
        lazy[2 * id] = lazy[2 * id + 1] = lazy[id];  
  
    # make lazy[id] = 0,  
    # so that it has no pending updates  
    lazy[id] = 0;  
  
    # call for two child nodes  
    update(x, y, value, 2 * id, l, mid);  
    update(x, y, value, 2 * id + 1, mid, r);  
  
# Function to find non-zero integers 
# in the range [l, r)  
def query(id, l, r) :  
      
    # if id contains positive number  
    if (lazy[id]) : 
          
        se.add(lazy[id]);  
          
        # There is no need to see the children,  
        # because all the interval have same number  
        return;  
      
    # check for out of bound  
    if (r - l < 2) : 
        return;  
  
    # find the middle number  
    mid = (l + r) // 2;  
  
    # call for two child nodes  
    query(2 * id, l, mid);  
    query(2 * id + 1, mid, r);  
  
# Driver code  
if __name__ == "__main__" : 
  
    # size of the array and number of queries  
    n = 5; q = 3;  
  
    # Update operation for l, r, x, id, 0, n  
    update(1, 4, 1, 1, 0, n);  
    update(0, 2, 2, 1, 0, n);  
    update(3, 4, 3, 1, 0, n);  
  
    # Query operation to get answer 
    # in the range [0, n-1]  
    query(1, 0, n);  
  
    # Print the count of non-zero elements  
    print(len(se));  
      
# This code is contributed by AnkitRai01 

