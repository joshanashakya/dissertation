import java.util.*; public class _1437B {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {            int n=sc.nextInt();            String s=sc.next();            int zero=0,one=0;            for(int i=0;i<s.length()-1;i++){                 if(s.charAt(i)=='1' && s.charAt(i+1)=='1')                     one++;                 if(s.charAt(i)=='0' && s.charAt(i+1)=='0')                      zero++;            }            System.out.println(Math.max(zero,one));        }    }}
