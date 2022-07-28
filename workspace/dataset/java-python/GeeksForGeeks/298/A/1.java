

// Java Implementation of above approach  
import java.io.*;  
  
class GFG  
{  
  
// Function to return the total  
// requried sub-sequences  
static int solve(String test, int MOD)  
{  
    int size = test.length();  
    int total = 0;  
  
    // Find ways for all values of x  
    for (int i = 0; i <= 8; i++) 
    {  
        int x = i;  
  
        // x+1  
        int y = i + 1;  
        String newtest = "";  
  
        // Removing all unnecessary digits  
        for (int j = 0; j < size; j++) 
        {  
            if (test.charAt(j) == x + 48 || test.charAt(j) == y + 48)  
            {  
                newtest += test.charAt(j);  
            }  
        }  
  
        if (newtest.length() > 0) {  
            int size1 = newtest.length();  
  
            // Prefix Sum Array for X+1 digit  
            int []prefix = new int[size1];  
            for (int j = 0; j < size1; j++) 
            {  
                prefix[j] = 0; 
                if (newtest.charAt(j) == y + 48)  
                {  
                    prefix[j]++;  
                }  
            }  
  
            for (int j = 1; j < size1; j++) 
            {  
                prefix[j] += prefix[j - 1];  
            }  
  
            int count = 0;  
            int firstcount = 0;  
  
            // Sum of squares  
            int ss = 0;  
  
            // Previous sum of all possible pairs  
            int prev = 0;  
  
            for (int j = 0; j < size1; j++)  
            {  
                if (newtest.charAt(j) == x + 48)  
                {  
                    count++;  
                    firstcount++;  
                }  
                else 
                {  
  
                    ss += count * count;  
  
                    // To find sum of multiplication of all  
                    // possible pairs  
                    int pairsum = (firstcount * firstcount - ss) / 2;  
                    int temp = pairsum;  
  
                    // To prevent overcounting  
                    pairsum -= prev;  
                    prev = temp;  
  
                    int secondway = prefix[size1 - 1];  
                    if (j != 0)  
                        secondway -= prefix[j - 1];  
  
                    int answer = count * (count - 1)  
                                * secondway * (secondway - 1);  
                    answer /= 4;  
                    answer += (pairsum * secondway  
                            * (secondway - 1)) / 2;  
  
                    // Adding ways for all possible x  
                    total += answer;  
                    count = 0;  
                }  
            }  
        }  
    }  
  
    return total;  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    String test = "13134422";  
    int MOD = 1000000007; 
    System.out.println(solve(test,MOD)); 
  
}  
}  
  
// This code is contributed by krikti..  

