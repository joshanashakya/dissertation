import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        String s1=s.nextLine();        if(s1.contains("ABC") || s1.contains("ACB") || s1.contains("BAC") || s1.contains("BCA") || s1.contains("CBA") || s1.contains("CAB"))            System.out.println("Yes");        else            System.out.println("No");    }}
