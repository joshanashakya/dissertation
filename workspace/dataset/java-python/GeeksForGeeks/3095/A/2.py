

# Python3 implementation to find the number  
# of sub-arrays ending with arr[i] which  
# is the minimum element of the subarray  
  
# Function to find the number  
# of sub-arrays ending with arr[i] which  
# is the minimum element of the subarray  
def min_subarray(a, n) :  
  
    st = [];  
      
    for i in range(n) : 
          
        # There exsits a subarray of  
        # size 1 for each element  
        count = 1;  
  
        # Remove all greater elements  
        while len(st) != 0 and st[-1][0] > a[i] : 
              
            # Increment the count  
            count += st[-1][1];  
  
            # Remove the element  
            st.pop();  
  
        # Push the current element  
        # and it's count  
        st.append(( a[i], count ));  
  
        print(count,end= " ");  
  
# Driver Code  
if __name__ == "__main__" :  
  
    a = [5, 4, 3, 2, 1];  
    n = len(a);  
  
    min_subarray(a, n);  
  
# This code is contributed by AnkitRai01 

