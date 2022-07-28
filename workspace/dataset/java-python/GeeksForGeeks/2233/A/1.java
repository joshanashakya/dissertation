

//Java program to print the smallest 
// integer not less than N with all odd digits 
  
public class GFG { 
  
// function to return the smallest number 
// with all digits odd 
    static int smallestNumber(int n) { 
        int num = 0; 
        String s = ""; 
  
        int duplicate = n; 
        // convert the number to string to 
        // perform operations 
        while (n > 0) { 
            s = (char) (n % 10 + 48) + s; 
            n /= 10; 
        } 
  
        int index = -1; 
  
        // find out the first even number 
        for (int i = 0; i < s.length(); i++) { 
            int digit = s.charAt(i) - '0'; 
            if ((digit & 1) == 0) { 
                index = i; 
                break; 
            } 
        } 
  
        // if no even numbers are there, than n is the answer 
        if (index == -1) { 
            return duplicate; 
        } 
  
        // add all digits till first even 
        for (int i = 0; i < index; i++) { 
            num = num * 10 + (s.charAt(i) - '0'); 
        } 
  
        // increase the even digit by 1 
        num = num * 10 + (s.charAt(index) - '0' + 1); 
  
        // add 1 to the right of the even number 
        for (int i = index + 1; i < s.length(); i++) { 
            num = num * 10 + 1; 
        } 
  
        return num; 
    } 
  
// Driver Code 
    static public void main(String[] args) { 
        int N = 2397; 
        System.out.println(smallestNumber(N)); 
    } 
} 
  
/*This code is contributed by PrinciRaj1992*/

