

// Java implementation of the approach  
import java.util.*; 
  
class GFG { 
  
    final static int N = 400005; 
    final static int mod = 1000000007; 
  
    static int[][] seg_tree = new int[N][26]; 
    static StringBuilder str; 
  
    // A recursive function that constructs 
    // Segment Tree for given String 
    static void build(int pos, int st, int en) { 
  
        if (st == en) { 
  
            // Increment the frequency of character 
            // by one if st is equal to en 
            seg_tree[pos][str.charAt(st - 1) - 'a']++; 
            return; 
        } 
  
        int mid = st + en >> 1; 
  
        // Build the segment tree for range st to mid 
        build(2 * pos, st, mid); 
  
        // Build the segment tree for range mid+1 to en 
        build(2 * pos + 1, mid + 1, en); 
  
        // It stores addition of frequency of 
        // characters of both of its child after 
        // segment tree is build 
        for (int i = 0; i < 26; i++) 
            seg_tree[pos][i] = seg_tree[2 * pos + 1][i] + seg_tree[2 * pos][i]; 
  
    } 
  
    // A utility function for 
    // addition of two vectors 
    static int[] add_two_result(int[] v1, int[] v2) { 
        int[] added_vec = new int[26]; 
  
        // Adding two vector and storing 
        // it in another vector 
        for (int i = 0; i < 26; i++) 
            added_vec[i] = v1[i] + v2[i]; 
  
        // Returning final vector 
        return added_vec; 
  
    } 
  
    // A recursive function that return vector 
    // which contains frequency of every character 
    static int[] get(int pos, int l, int r, int st, int en) { 
  
        // If segment of this node is 
        // outside the given range 
        if (l > en || r < st) { 
            int[] empty = new int[26]; 
            return empty; 
        } 
  
        // If segment of this node is a part 
        // of given range, then return the 
        // frequency every character of the segment 
        if (st >= l && en <= r) { 
            return seg_tree[pos]; 
        } 
  
        // getting mid of st and en 
        int mid = st + en >> 1; 
  
        // storing answer of left child n v1 
        int[] v1 = get(2 * pos, l, r, st, mid); 
  
        // storing answer of left child n v1 
        int[] v2 = get(2 * pos + 1, l, r, mid + 1, en); 
  
        // returning the addition of both vectors 
        return add_two_result(v1, v2); 
    } 
  
    // A recursive function that update 
    // frequency of new and old character 
    static void update(int pos, int indx, int st, int en, char pre, char cur) { 
  
        // If segment of this node is 
        // outside the given range 
        if (indx > en || indx < st) 
            return; 
  
        // Subtract frequency of previous character 
        seg_tree[pos][pre - 'a']--; 
  
        // Add frequency of new character 
        seg_tree[pos][cur - 'a']++; 
  
        if (st != en) { 
            int mid = st + en >> 1; 
  
            // update left child 
            update(2 * pos, indx, st, mid, pre, cur); 
  
            // update right child 
            update(2 * pos + 1, indx, mid + 1, en, pre, cur); 
        } 
    } 
  
    static int count_frequency(String s, int[] v) { 
        int ans = 1; 
  
        // multiplying frequency of all 
        // characters in String hard 
        for (int i = 0; i < s.length(); i++) 
            ans = (ans * v[s.charAt(i) - 'a']) % mod; 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) { 
  
        int n, q, ans; 
        int[] v; 
  
        n = 15; 
        str = new StringBuilder("haardhhardrddrd"); 
  
        build(1, 1, n); 
        String s = "hard"; 
  
        // getting frequency of all 
        // characters from 1 to 5 
        v = get(1, 1, 5, 1, n); 
  
        // Calling count_frequency 
        ans = count_frequency(s, v); 
  
        System.out.println(ans); 
  
        // Updating character at index 3 
        update(1, 3, 1, n, str.charAt(2), 'x'); 
        str.setCharAt(2, 'x'); 
  
        // getting frequency of all 
        // characters from 1 to 5 
        v = get(1, 1, 5, 1, n); 
  
        // calling count_frequency 
        ans = count_frequency(s, v); 
  
        System.out.println(ans); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

