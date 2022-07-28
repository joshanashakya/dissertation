

// Efficient Java program to count  
// Amicable pairs in an array. 
import java.util.*; 
  
class GFG  
{ 
  
// Calculate the sum  
// of proper divisors 
static int sumOfDiv(int x) 
{ 
    // 1 is a proper divisor 
    int sum = 1; 
    for (int i = 2; i <= Math.sqrt(x); i++)  
    { 
        if (x % i == 0)  
        { 
            sum += i; 
  
            // To handle perfect squares 
            if (x / i != i) 
                sum += x / i; 
        } 
    } 
    return sum; 
} 
  
// Check if pair is amicable 
static boolean isAmicable(int a, int b) 
{ 
    return (sumOfDiv(a) == b &&  
            sumOfDiv(b) == a); 
} 
  
// This function prints count  
// of amicable pairs present  
// in the input array 
static int countPairs(int arr[], int n) 
{ 
    // Map to store the numbers 
    HashSet<Integer> s = new HashSet<Integer>(); 
    int count = 0; 
    for (int i = 0; i < n; i++) 
        s.add(arr[i]); 
  
    // Iterate through each number,  
    // and find the sum of proper  
    // divisors and check if it's  
    // also present in the array 
    for (int i = 0; i < n; i++)  
    { 
        if (s.contains(sumOfDiv(arr[i])))  
        { 
            // It's sum of proper divisors 
            int sum = sumOfDiv(arr[i]); 
            if (isAmicable(arr[i], sum)) 
                count++; 
        } 
    } 
  
    // As the pairs are counted  
    // twice, thus divide by 2 
    return count / 2; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr1[] = { 220, 284, 1184,  
                   1210, 2, 5 }; 
    int n1 = arr1.length; 
    System.out.println(countPairs(arr1, n1)); 
      
    int arr2[] = { 2620, 2924, 5020,  
                   5564, 6232, 6368 }; 
    int n2 = arr2.length; 
    System.out.println(countPairs(arr2, n2)); 
} 
} 
  
// This code is contributed by PrinciRaj1992  
