

# Python3 implementation of the above approach 
  
# function to return valid indexes  
def find_idx(ar, n) :  
  
    # Vector to store the answer  
    answer = [];  
  
    # Initial sum would always  
    # be first element  
    sum = ar[0];  
  
    for i in range(1, n) : 
  
        # Check if sum till now  
        # is equal to current element  
        if (sum == ar[i]) : 
            answer.append(i + 1);  
  
        # Updating the sum by  
        # adding the current  
        # element in each  
        # iteration.  
        sum += ar[i]; 
  
    return answer;  
  
# Driver code  
if __name__ == "__main__" :  
  
    ar = [ 1, 2, 3, 6, 3, 15, 5 ];  
    n = len(ar);  
  
    ans = find_idx(ar, n);  
  
    if (len(ans) != 0) : 
          
        for i in ans : 
            print(i, end = " ");  
              
    else : 
          
        print("-1");  
  
    print();  
  
# This code is contributed by AnkitRai01 

