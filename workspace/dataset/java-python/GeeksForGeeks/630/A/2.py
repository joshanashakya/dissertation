

# Python3 program to search the element  
# in an array for every query and  
# move the searched element to  
# the front after every query 
  
# Function to find the indices  
def processQueries(Q, m, n) :  
  
    a = [0]*(m + 1); pos = [0]*(m + 1);  
  
    for i in range(1, m + 1) :  
        a[i - 1] = i;  
        pos[i] = i - 1;  
  
    ans = [];  
  
    # iterate in the query array  
    for i in range(n) : 
        q = Q[i];  
  
        # store current element  
        p = pos[q];  
  
        ans.append(p);  
  
        for i in range(p,0,-1) :  
  
            # swap positions of the element  
            a[i], a[i - 1] = a[i - 1],a[i]; 
            pos[a[i]] = i;  
  
        pos[a[0]] = 0;  
  
    # return the result  
    return ans;  
  
# Driver code  
if __name__ == "__main__" : 
  
    # initialise array  
    Q = [ 3, 1, 2, 1 ];  
    n = len(Q);  
  
    m = 5;  
  
    ans = [];  
  
    # Function call  
    ans = processQueries(Q, m, n);  
  
    # Print answers to queries  
    for i in range(len(ans)) : 
        print(ans[i],end=" ");  
  
# This code is contributed by Yash_R 

