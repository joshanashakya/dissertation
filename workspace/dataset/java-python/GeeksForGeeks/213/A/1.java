

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to generate sequence 
// from the given String 
static Vector<Integer> makeSeq(String s, int a[]) 
{ 
    // Initialize vector to 
    // store sequence 
    Vector<Integer> seq = new Vector<Integer>(); 
  
    // First add all the digits 
    // of group A from left to right 
    for (int i = 0; i < s.length(); i++) 
        if (s.charAt(i) == 'A') 
            seq.add(a[i]); 
  
    // Then add all the digits 
    // of group B from left to right 
    for (int i = 0; i < s.length(); i++) 
        if (s.charAt(i) == 'B') 
            seq.add(a[i]); 
  
    // Return the sequence 
    return seq; 
} 
  
// Function that returns true if 
// the sequence is non-decreasing 
static boolean checkSeq(Vector<Integer> v) 
{ 
    // Initialize result 
    boolean check = true; 
  
    for (int i = 1; i < v.size(); i++) 
        if (v.get(i) < v.get(i - 1)) 
            check = false; 
  
    return check; 
} 
  
// Function to partition the digits 
// of an integer such that it satisfies 
// the given conditions 
static String digitPartition(int X) 
{ 
    // Convert the integer to String 
    String num = String.valueOf(X); 
  
    // Length of the String 
    int l = num.length(); 
  
    // Array to store the digits 
    int []a = new int[l]; 
  
    // Storing the digits of X in array 
    for (int i = 0; i < l; i++) 
        a[i] = (num.charAt(i) - '0'); 
  
    for (int D = 0; D < 10; D++)  
    { 
  
        // Initialize the result 
        String res = ""; 
  
        // Loop through the digits 
        for (int i = 0; i < l; i++)  
        { 
  
            // Put into group A if 
            // digit less than D 
            if (a[i] < D) 
                res += 'A'; 
  
            // Put into group B if 
            // digit greater than D 
            else if (a[i] > D) 
                res += 'B'; 
  
            // Put into group C if 
            // digit equal to D 
            else
                res += 'C'; 
        } 
  
        boolean flag = false; 
  
        // Loop through the digits 
        // to decide for group C digits 
        for (int i = 0; i < l; i++)  
        { 
  
            // Set flag equal to true 
            // if group B digit present 
            if (res.charAt(i) == 'B') 
                flag = true; 
  
            // If flag is true put in 
            // group A or else put in B 
            if (res.charAt(i) == 'C') 
                res = res.substring(0, i) +  
                (flag ? 'A' : 'B') + res.substring(i + 1); 
        } 
  
        // Generate the sequence from partition 
        Vector<Integer> seq = makeSeq(res, a); 
  
        // Check if the sequence is 
        // non decreasing 
        if (checkSeq(seq)) 
            return res; 
    } 
  
    // Return -1 if no such 
    // partition is possible 
    return "-1"; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int X = 777147777; 
  
    System.out.print(digitPartition(X)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

