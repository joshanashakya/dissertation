import java.util.Scanner; public class Main {     public static void main(String[] args) {    Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        String s=sc.next();        int[] a= {0,0,0,0,0,0,0,0,0,0};        for (int i=0;i<n;i++){            if (s.charAt(i)=='L'){                for (int j=0;j<10;j++){                    if (a[j]==0){                        a[j]=1;                        break;                    }                }            }else if(s.charAt(i)=='R') {                for (int j=9;j>=0;j--){                    if (a[j]==0){                        a[j]=1;                        break;                    }                }            }else {                a[(int)s.charAt(i)-48]=0;            }        }        for (int i=0;i<10;i++){            System.out.print(a[i]);        }    }}