

// Java program to find minimum number 
// of operations to convert a given 
// sequence to an Geometric Progression 
import java.util.*; 
  
class GFG 
{ 
      
static class pair 
{  
    double first, second;  
    public pair(double first, double second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
// Function to print the GP series 
static void construct(int n, pair ans_pair) 
{ 
    // Check for possibility 
    if (ans_pair.first == -1) 
    { 
        System.out.print("Not possible"); 
        return; 
    } 
    double a1 = ans_pair.first; 
    double a2 = ans_pair.second; 
    double r = a2 / a1; 
  
    System.out.print("The resultant sequence is:\n"); 
    for (int i = 1; i <= n; i++) 
    { 
        int ai = (int) (a1 * Math.pow(r, i - 1)); 
        System.out.print(ai + " "); 
    } 
} 
  
// Function for getting the Arithmetic Progression 
static void findMinimumOperations(double []a, int n) 
{ 
    int ans = Integer.MAX_VALUE; 
      
    // The array c describes all the given set of 
    // possible operations. 
    int c[] = { -1, 0, 1 }; 
      
    // Size of c 
    int possiblities = 3; 
  
    // candidate answer 
    int pos1 = -1, pos2 = -1; 
  
    // loop through all the permutations of the first two 
    // elements. 
    for (int i = 0; i < possiblities; i++)  
    { 
        for (int j = 0; j < possiblities; j++)  
        { 
  
            // a1 and a2 are the candidate first two elements 
            // of the possible GP. 
            double a1 = a[1] + c[i]; 
            double a2 = a[2] + c[j]; 
  
            // temp stores the current answer, including the 
            // modification of the first two elements. 
            int temp = (int) (Math.abs(a1 - a[1]) + Math.abs(a2 - a[2])); 
  
            if (a1 == 0 || a2 == 0) 
                continue; 
  
            // common ratio of the possible GP 
            double r = a2 / a1; 
  
            // To check if the chosen set is valid, and id yes 
            // find the number of operations it takes. 
            for (int pos = 3; pos <= n; pos++) 
            { 
  
                // ai is value of a[i] according to the assumed 
                // first two elements a1, a2 
                // ith element of an GP = a1*((a2-a1)^(i-1)) 
                double ai = a1 * Math.pow(r, pos - 1); 
  
                // Check for the "proposed" element to be only 
                // differing by one 
                if (a[pos] == ai) 
                { 
                    continue; 
                } 
                else if (a[pos] + 1 == ai || a[pos] - 1 == ai) 
                { 
                    temp++; 
                } 
                else
                { 
                    temp = Integer.MAX_VALUE; // set the temporary ans 
                    break; // to infinity and break 
                } 
            } 
  
            // update answer 
            if (temp < ans)  
            { 
                ans = temp; 
                pos1 = (int) a1; 
                pos2 = (int) a2; 
            } 
        } 
    } 
    if (ans == -1)  
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    System.out.print("Minimum Number of Operations are " + ans+ "\n"); 
    pair ans_pair = new pair( pos1, pos2 ); 
  
    // Calling function to print the sequence 
    construct(n, ans_pair); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
  
    // array is 1-indexed, with a[0] = 0 
    // for the sake of simplicity 
    double a[] = { 0, 7, 20, 49, 125 }; 
  
    int n = a.length; 
  
    // Function to print the minimum operations 
    // and the sequence of elements 
    findMinimumOperations(a, n - 1); 
} 
} 
  
// This code is contributed by 29AjayKumar 

