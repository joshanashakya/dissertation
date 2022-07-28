

// Java program to check if a string can be splitted  
// into two strings such that one is divisible by 'a'  
// and other is divisible by 'b'.  
class GFG 
{ 
      
// Finds if it is possible to partition str  
// into two parts such that first part is  
// divisible by a and second part is divisible  
// by b.  
static void findDivision(String str, int a, int b)  
{  
    int len = str.length();  
  
    // Create an array of size len+1 and initialize  
    // it with 0.  
    // Store remainders from left to right when  
    // divided by 'a'  
    int[] lr = new int[len + 1];  
      
    lr[0] = ((int)str.charAt(0) - (int)'0')%a;  
    for (int i = 1; i < len; i++)  
        lr[i] = ((lr[i - 1] * 10) % a +  
                ((int)str.charAt(i)-(int)'0')) % a;  
  
    // Compute remainders from right to left when  
    // divided by 'b'  
    int[] rl = new int[len + 1];  
    rl[len - 1] = ((int)str.charAt(len - 1) - 
                            (int)'0') % b;  
    int power10 = 10;  
    for (int i= len - 2; i >= 0; i--)  
    {  
        rl[i] = (rl[i + 1] + ((int)str.charAt(i) -  
                        (int)'0') * power10) % b;  
        power10 = (power10 * 10) % b;  
    }  
  
    // Find a point that can partition a number  
    for (int i = 0; i < len - 1; i++)  
    {  
        // If split is not possible at this point  
        if (lr[i] != 0)  
            continue;  
  
        // We can split at i if one of the following  
        // two is true.  
        // a) All charactes after str.charAt(i] are 0  
        // b) String after str.charAt(i] is divisible by b, i.e.,  
        // str.charAt(i+1..n-1] is divisible by b.  
        if (rl[i + 1] == 0)  
        {  
            System.out.println("YES");  
            for (int k = 0; k <= i; k++)  
                System.out.print(str.charAt(k));  
  
            System.out.print(", ");  
  
            for (int k = i + 1; k < len; k++)  
                System.out.print(str.charAt(k));  
            return;  
        }  
    }  
    System.out.println("NO");  
}  
  
// Driver code  
public static void main (String[] args)  
{ 
    String str = "123";  
    int a = 12, b = 3;  
    findDivision(str, a, b);  
}  
} 
  
// This code is contributed by mits 

