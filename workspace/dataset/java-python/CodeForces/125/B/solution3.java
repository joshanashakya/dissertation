import java.util.*; public class Main {      public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String s=sc.nextLine();        String[] c=s.split("><");        c[0]=c[0].substring(1);        c[c.length-1]=c[c.length-1].substring(0,2);        int spaces=0;        for(int i=0;i<c.length;i++){            if(c[i].charAt(0)!='/'){                for(int j=spaces;j>0;j--)                    System.out.print(" ");                System.out.println("<"+c[i]+">");                spaces+=2;            }else{                spaces-=2;                for(int j=spaces;j>0;j--)                    System.out.print(" ");                System.out.println("<"+c[i]+">");            }        }     } }