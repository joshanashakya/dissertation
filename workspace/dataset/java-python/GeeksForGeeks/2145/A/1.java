

// Java program to break the number string 
// into two divisible parts by given numbers 
public class DivisibleParts 
{ 
    // method prints divisible parts if  
    // possible, otherwise prints 'Not possible' 
    static void printTwoDivisibleParts(String num,  
                                     int f, int s) 
    { 
    int N = num.length(); 
  
    // creating arrays to store reminder 
    int[] prefixReminder = new int[N + 1]; 
    int[] suffixReminder = new int[N + 1]; 
  
    suffixReminder[0] = 0; 
  
    // looping over all suffix and storing  
    // reminder with f 
    for (int i = 1; i < N; i++)  
  
        // getting suffix reminder from  
        // previous suffix reminder 
        suffixReminder[i] = (suffixReminder[i - 1] * 10 +  
                        (num.charAt(i - 1) - '0')) % f;  
  
    prefixReminder[N] = 0; 
    int base = 1; 
  
    // looping over all prefix and storing  
    // reminder with s 
    for (int i = N - 1; i >= 0; i--) { 
  
        // getting prefix reminder from next  
        // prefix reminder 
        prefixReminder[i] = (prefixReminder[i + 1] +  
                        (num.charAt(i ) - '0') * base) % s; 
  
        // updating base value 
        base = (base * 10) % s; 
    } 
  
    // now looping over all reminders to  
    // check partition condition 
    for (int i = 0; i < N; i++) { 
  
        // if both reminders are 0 and digit 
        // itself is not 0, then print result 
        // and return 
        if (prefixReminder[i] == 0 &&  
            suffixReminder[i] == 0 &&  
            num.charAt(i ) != '0') { 
                System.out.println( num.substring(0, i)  
                           +" " + num.substring(i)); 
            return; 
        } 
    } 
  
    // if we reach here, then string can' be  
    // partitioned under constraints 
        System.out.println("Not Possible"); 
      
    } 
      
    /* Driver program */
    public static void main(String[] args)  
    { 
    String num = "246904096"; 
    int f = 12345; 
    int s = 1024; 
    printTwoDivisibleParts(num, f, s); 
    } 
} 
// This code is contributed by Prerna Saini 

