import java.util.*; public class Solve {     static Scanner scan = new Scanner(System.in);     public static void solve(int n,String s){        int ud=0,lr=0;        for (int i = 0; i < n; i++) {            if(s.charAt(i)=='L'){                lr--;            }            else if(s.charAt(i)=='R'){                lr++;            }            else if(s.charAt(i)=='U'){                ud++;            }            else{                ud--;            }        }        System.out.println(n-(Math.abs(lr)+Math.abs(ud)));    }     public static void main(String[] args) {         int n = scan.nextInt();        String s = scan.next();         solve(n,s);    }}
