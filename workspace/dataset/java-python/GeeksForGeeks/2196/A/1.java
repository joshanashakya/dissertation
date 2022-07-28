

// Java program to find the largest 
// and smallest N-digit numbers 
// in Octal Number System 
class GFG 
{ 
   
// Function to return the largest 
// N-digit number in Octal 
// Number System 
static String findLargest(int N) 
{ 
    // Append '7' N times 
    String largest = strings(N, '7'); 
   
    return largest; 
} 
   
// Function to return the smallest 
// N-digit number in Octal 
// Number System 
static String findSmallest(int N) 
{ 
    // Append '0' (N - 1) times to 1 
    String smallest 
        = "1"
          + strings((N - 1), '0'); 
   
    return smallest; 
} 
   
private static String strings(int N, char c) { 
    String temp =""; 
    for(int i= 0; i < N; i++) { 
        temp+=c; 
    } 
    return temp; 
} 
  
// Function to print the largest and 
// smallest N-digit Octal number 
static void printLargestSmallest(int N) 
{ 
    System.out.print("Largest: "
         + findLargest(N) +"\n"); 
    System.out.print("Smallest: "
         + findSmallest(N) +"\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 4; 
   
    // Function Call 
    printLargestSmallest(N);  
} 
} 
  
// This code is contributed by 29AjayKumar 

