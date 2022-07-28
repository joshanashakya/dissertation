

// Java program to find if a number is 
// divisible by 11 or not 
class IsDivisible 
{ 
    // Function to find that number divisible by 11 or not 
    static boolean check(String str) 
    { 
        int n = str.length(); 
       
        // Compute sum of even and odd digit 
        // sums 
        int oddDigSum = 0, evenDigSum = 0; 
        for (int i=0; i<n; i++) 
        { 
            // When i is even, position of digit is odd 
            if (i%2 == 0) 
                oddDigSum += (str.charAt(i)-'0'); 
            else
                evenDigSum += (str.charAt(i)-'0'); 
        } 
       
        // Check its difference is divisible by 11 or not 
        return ((oddDigSum - evenDigSum) % 11 == 0); 
    } 
      
    // main function 
    public static void main (String[] args)  
    { 
        String str = "76945"; 
        if(check(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}  

