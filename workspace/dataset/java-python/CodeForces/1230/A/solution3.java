/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		Scanner sc = new Scanner(System.in);        // int a = sc.nextInt();        // int b = sc.nextInt();        // int c = sc.nextInt();        // int d = sc.nextInt();        int a[] = new int [4];        int sum = 0;        for(int i =0 ; i < 4 ; i++){            a[i] = sc.nextInt();            sum += a[i];        }        if(sum % 2 == 0){            boolean poss = false;            for(int i = 0 ; i < 4 ; i++){                int ans = a[i];                if(a[i] == sum / 2){                    poss = true;                    break;                }                for(int j = 0 ; j < 4 ; j++){                    if(i != j){                        ans += a[j];                        if(ans == sum / 2){                            poss = true;                            break;                        }                    }                }                if(poss){                    break;                }            }            if(poss){                System.out.println("YES");            }else{                System.out.println("NO");            }        }else{            System.out.println("NO");        }	}}