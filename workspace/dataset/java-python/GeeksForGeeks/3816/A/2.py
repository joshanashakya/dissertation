

# Python3 implementation of the approach  
import sys; 
  
# Function to return the chosen indices  
def solve(X, A) :  
  
    minimum = sys.maxsize; 
    ind = -1; 
      
    for i in range(len(A)) : 
        if (A[i] < minimum ) : 
            minimum = A[i]; 
            ind = i; 
      
    # Maximum indices chosen  
    maxIndChosen = X // minimum ; 
      
    ans = []; 
      
    if (maxIndChosen == 0) : 
        return ans; 
          
    for i in range(maxIndChosen) : 
        ans.append(ind); 
          
    temp = maxIndChosen; 
    sum = maxIndChosen * A[ind]; 
      
    # Try to replace the first element in ans by i, 
    # making the order lexicographically smaller 
    for i in range(ind) : 
          
        # If no further replacement possible return  
        if (sum - X == 0 or temp == 0) : 
            break; 
              
        # If found an index smaller than ind and sum  
        # not exceeding X then remove index of smallest  
        # value from ans and then add index i to ans 
        while ((sum - A[ind] + A[i]) <= X and temp != 0) : 
            del(ans[0]); 
            ans.append(i);  
            temp -= 1; 
            sum += (A[i] - A[ind]);  
              
    ans.sort(); 
    return ans;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = [ 5, 6, 4, 8 ];  
    X = 18;  
  
    ans = solve(X, A);  
  
    # Print the chosen indices  
    for i in range(len(ans)) :  
        print(ans[i],end= " ");  
  
# This code is contributed by AnkitRai01 

