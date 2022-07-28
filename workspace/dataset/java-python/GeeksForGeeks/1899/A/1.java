

// Java program to implement above approach  
import java.util.HashMap; 
import java.util.Stack; 
  
class GFG  
{ 
  
    // Function to find the count 
    public static void countEle(Stack<Integer> s,  
                                int[] a, int N)  
    { 
  
        // Hashmap to store all the elements 
        // which are popped once. 
        HashMap<Integer,  
                Boolean> mp = new HashMap<>(); 
        for (int i = 0; i < N; ++i) 
        { 
            int num = a[i]; 
  
            // Check if the number is present 
            // in the hashmap Or in other words 
            // been popped out from the stack before. 
            if (mp.containsKey(num)) 
                System.out.print("0 "); 
            else 
            { 
                int cnt = 0; 
  
                // Keep popping the elements 
                // while top is not equal to num 
                while (s.peek() != num)  
                { 
                    mp.put(s.peek(), true); 
                    s.pop(); 
                    cnt++; 
                } 
  
                // Pop the top ie. equal to num 
                s.pop(); 
                cnt++; 
  
                // Print the number of elements popped. 
                System.out.print(cnt + " "); 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int N = 5; 
  
        Stack<Integer> s = new Stack<>(); 
        s.add(1); 
        s.add(2); 
        s.add(3); 
        s.add(4); 
        s.add(6); 
  
        int[] a = { 6, 3, 4, 1, 2 }; 
        countEle(s, a, N); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

