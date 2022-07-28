

// Java program to find the number  
//of operations required to make  
//all array elements Equal  
  
import java.util.Arrays; 
  
class GFG { 
  
//Function to find maximum  
//element of the given array  
    static int find_n(int[] a) { 
        int j = 0, k = 0, s = 0; 
  
        int x = Arrays.stream(a).max().getAsInt(); 
        int y = Arrays.stream(a).min().getAsInt(); 
        for (int i : a) { 
            if (a[i] == x) { 
                s = i; 
                break; 
            } 
  
        } 
        for (int i : a) { 
            if (i != x && i <= y && i != 0) { 
                a[j] += 1; 
                a[s] -= 1; 
                x -= 1; 
                k += 1; 
                j += 1; 
            } else if (i != 0) { 
                j += 1; 
            } 
        } 
  
        for (int i : a) { 
            if (a[i] != x) { 
                k = -1; 
                break; 
            } 
        } 
        return k; 
    } 
//Driver Code  
  
    public static void main(String[] args) { 
  
        int[] a = {1, 6, 1, 1, 1}; 
        System.out.println(find_n(a)); 
    } 
  
} 

