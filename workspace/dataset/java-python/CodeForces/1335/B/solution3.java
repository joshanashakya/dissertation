import java.util.*; public class Main {     public static void main(String[] args) {         Scanner in = new Scanner(System.in);        String alph = "abcdefghijklmnopqrstuvwxyz";        int t = in.nextInt(); // number of test cases        while (t-- > 0) {            String result = "";            int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();            String ff = alph.substring(0, b);            while (result.length() < n) {                result += ff;            }            int min = Math.min(result.length(), n);            result = result.substring(0,min);            System.out.println(result);        }    }}