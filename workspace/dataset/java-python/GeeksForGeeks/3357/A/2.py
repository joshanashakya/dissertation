

# Python3 implementation of the approach 
N = 400005
mod = 1000000007
  
seg_tree = [[0 for i in range(26)] for i in range(N)] 
str = "" 
  
# A recursive function that constructs 
# Segment Tree for given 
def build(pos, st, en): 
  
    if (st == en): 
  
        # Increment the frequency of character 
        # by one if st is equal to en 
        seg_tree[pos][ord(str[st - 1] )- ord('a')]+=1
        return
  
    mid = st + en >> 1
  
    # Build the segment tree for range st to mid 
    build(2 * pos, st, mid) 
  
    # Build the segment tree for range mid+1 to en 
    build(2 * pos + 1, mid + 1, en) 
  
    # It stores addition of frequency of 
    # characters of both of its child after 
    # segment tree is build 
    for i in range(26): 
        seg_tree[pos][i] = seg_tree[2 * pos + 1][i] + \ 
                            seg_tree[2 * pos][i] 
  
# A utility function for 
# addition of two vectors 
def add_two_result(v1,v2): 
  
    added_vec=[0]*(26) 
  
    # Adding two vector and storing 
    # it in another vector 
    for i in range(26): 
        added_vec[i] = v1[i] + v2[i] 
  
    # Returning final vector 
    return added_vec 
  
# A recursive function that return vector 
# which contains frequency of every character 
def get(pos, l, r,st, en): 
  
    # If segment of this node is 
    # outside the given range 
    if (l > en or r < st): 
        empty = [0]*26
        return empty 
  
    # If segment of this node is a part 
    # of given range, then return the 
    # frequency every character of the segment 
    if (st >= l and en <= r): 
  
        return seg_tree[pos] 
  
    # getting mid of st and en 
    mid = st + en >> 1
  
    # storing answer of left child n v1 
    v1 = get(2 * pos, l,r, st, mid) 
      
    # storing answer of left child n v1 
    v2 = get(2 * pos + 1,l, r, mid + 1, en) 
  
    # returning the addition of both vectors 
    return add_two_result(v1, v2) 
  
# A recursive function that update 
# frequency of new and old character 
def update(pos, indx, st,en,pre,cur): 
  
    # If segment of this node is 
    # outside the given range 
    if (indx > en or indx < st): 
        return
  
    # Subtract frequency of previous character 
    seg_tree[pos][ord(pre) - ord('a')]-=1
  
    # Add frequency of new character 
    seg_tree[pos][ord(cur) - ord('a')]+=1
  
    if (st != en): 
  
        mid = st + en >> 1
  
        # update left child 
        update(2 * pos,indx, st,mid, pre, cur) 
  
        # update right child 
        update(2 * pos + 1, indx,mid + 1, en, pre, cur) 
  
def count_frequency(s,v): 
  
    ans = 1
      
    # multiplying frequency of all 
    # characters in hard 
    i = 0
    while i < len(s): 
        ans = (ans * v[ord(s[i]) - ord('a')]) % mod 
        i += 1
  
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    v=[] 
  
    n = 15
    str = "haardhhardrddrd"
    str=[i for i in str] 
  
    build(1, 1, n) 
    s = "hard"
  
    # getting frequency of all 
    # characters from 1 to 5 
    v = get(1, 1, 5, 1, n) 
  
    # Calling count_frequency 
    ans = count_frequency(s, v) 
  
    print(ans) 
  
    # Updating character at index 3 
    update(1, 3, 1, n, str[2], 'x') 
    str[2] = 'x'
  
    # getting frequency of all 
    # characters from 1 to 5 
    v = get(1, 1, 5, 1, n) 
  
    # calling count_frequency 
    ans = count_frequency(s, v) 
  
    print(ans) 
  
# This code is contributed by mohit kumar 29 

