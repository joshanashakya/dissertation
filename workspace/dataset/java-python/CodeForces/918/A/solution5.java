    import java.util.*;    import java.lang.*;    public class Solution{            public static void main(String[] args){        Scanner s=new Scanner(System.in);        String result="";        int n=s.nextInt();        int a[]=new int[1000];        int b[]=new int[n+1];        if(n==1){            result=result+'O';            System.out.println(result);        }        else{            a[0]=0;            a[1]=1;            for(int i=2;i<1000;i++){                a[i]=a[i-1]+a[i-2];            }                       for(int j=1;j<=n;j++){                boolean c=check(a,j);                if(c==false){                    result=result+'o';                }                else                    result=result+'O';            }            System.out.println(result);        }                            }    public static boolean check(int a[],int j){        for(int i=0;i<a.length;i++){            if(a[i]==j)                return true;        }        return false;    }      }    