import java.math.BigInteger;import java.util.*;import java.lang.*;import java.util.Arrays;    public class geek {      public static void main(String[] args) {        Scanner s=new Scanner(System.in);        try{                  StringBuffer sb=new StringBuffer();            int n=s.nextInt();                 int j=0,ans=0;            for(int i=0;i<n;i++){               j=0;              if(i%2==0) {                   while (j < n) {                      sb.append("C");                    ans++;                      j ++;                      if(j<n){                          sb.append(".");                          j++;                      }                  }              }else {                    while (j < n) {                      sb.append(".");                      j ++;                      if(j<n){                          sb.append("C");                          ans++;                          j++;                      }                  }              }              sb.append("\n");             }            System.out.println(ans+"\n"+sb);                      //solve.show(a);            //  solve.show(b);             }catch (Exception e){            System.out.println(e.getMessage());        }     } }          