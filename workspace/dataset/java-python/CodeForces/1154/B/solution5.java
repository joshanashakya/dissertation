import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        int dp[] = new int[101];        for(int i = 0; i < n; i++){            dp[s.nextInt()]++;        }        int a = -1,b = -1,c = -1;        for(int i = 0; i <= 100; i++){            if(dp[i] > 0){                if(a == -1){                    a = i;                }                else if(b == -1){                    b = i;                }                else if(c == -1){                    c = i;                }                else{                    System.out.println(-1);                    return;                }            }        }        if(b == -1 && c == -1){            System.out.println(0);            return;        }        if(c == -1){            if((b - a) % 2  == 0){                System.out.println((b - a)/2);            }            else{                System.out.println(b - a);            }            return;        }        if(2 * b == a + c){            System.out.println(b - a);        }        else{            System.out.println(-1);        }    }}
